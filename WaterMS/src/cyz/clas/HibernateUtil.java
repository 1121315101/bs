package cyz.clas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	//创建线程局部变量threadLocal,用来保存Hibernate的Session
	private static final ThreadLocal<Session> threadLocal =new ThreadLocal<Session>();
	//使用静态方法初始化Hibernate
	static{
		try{
			//读取配置文件hibernate.cfg.xml
			Configuration cfg=new Configuration().configure("cyz.hibernate.cfg.xml");
			//创建SessionFactory
			sessionFactory=cfg.buildSessionFactory();
		}catch(Throwable e){
			System.out.println(e.getMessage()+"这里不对");
		}
	}
	//获取session实例
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	//获取ThreadLocalLocal对象管理Session实例
	public static Session getSession(){
		Session session=(Session)threadLocal.get();
		if(session==null||!session.isOpen()){
			if(sessionFactory==null){
				rebuildSessionFactory();
			}
		}
		//通过sessionFactory对象创建Session对象
		session=(sessionFactory!=null)?sessionFactory.openSession():null;
		//将新打开的Session实例保存到局部变量threadLocal中
		threadLocal.set(session);
		return session;
	}

	
	//关闭session实例
	public static void closeSession(){
		//从线程局部变量thredLocal中获取之间存入的Session实例
		Session session=threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
	//关闭缓冲池和连接池
	public static void shutdown(){
		getSessionFactory().close();
	}
	
	
	
	
	//重建SessionFactory
	public static void rebuildSessionFactory() {
		try{
			sessionFactory=new Configuration().configure("cyz.hibernate.cfg.xml").buildSessionFactory();
		}catch(Exception e){
			System.out.println("Error Creating SessionFactory");
		}
	}
	
	
}

package cyz.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cyz.JavaBean.Contract;
import cyz.JavaBean.HR;
import cyz.JavaBean.Project;
import cyz.clas.HibernateUtil;

public class test {

	public static void main(String []args) {
//		Session session=HibernateUtil.getSessionFactory().openSession();
//		Transaction tc=session.beginTransaction();
//		try{
//			Project p=new Project();
//			String sql="select * from project where projectStateID ='待处理'";
//			List<Project> list=(List<Project>) session.createSQLQuery(sql).addEntity(Project.class).list();
//			tc.commit();
//			System.out.println(list.get(0).getProjectID());
//		}catch(Exception e){
//			System.out.println("测试失败"+e.getMessage());
//			e.printStackTrace();
//			tc.rollback();
//			HibernateUtil.closeSession();
//		}
		 String a=null;
	        if(a !=null)   {
	        	System.out.println("YY");
	        }else{
	        	System.out.println("tt");
	        }
	   
	}

}

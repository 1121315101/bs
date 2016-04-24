package cyz.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cyz.JavaBean.Project;
import cyz.clas.HibernateUtil;

public class projectDAOImp implements ProjectDAO {

	@Override
	public void save(Project project) {
		Session session = HibernateUtil.getSession();//生成session实例
		Transaction tx=session.beginTransaction();//创建Transaction实例
		try{
			session.save(project);
			tx.commit();
		}catch(Exception e){
			System.out.println(e.getMessage()+"出错");
			e.printStackTrace();
			tx.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		
	}

	@Override
	public Project findByID(String projectID) {
		Session session=HibernateUtil.getSession();
		Transaction tc=session.beginTransaction();
		Project project=null;
		try{
			project=(Project)session.get(Project.class, projectID);
			tc.commit();
		}catch(Exception e){
			tc.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return project;
	}


	public List<Project> findByState(String projectState) {
		Session session=HibernateUtil.getSession();
		Transaction tc=session.beginTransaction();
		List<Project> list=null;
		try{
			String sql="select * from project where projectStateID ='"+projectState+"'";
			list=(List<Project>) session.createSQLQuery(sql).addEntity(Project.class).list();
			tc.commit();
		}catch(Exception e){
			tc.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return list;
	}

}

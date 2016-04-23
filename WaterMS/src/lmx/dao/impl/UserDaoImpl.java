package lmx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lmx.dao.UserDao;
import lmx.entities.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see lmx.dao.impl.UserDao#listUser(java.lang.String, java.lang.String)
	 */
	@Override
	public List<User> listUser(String phone,String password){
		Query query = this.sessionFactory.getCurrentSession().createQuery("from User where phone = :pk_phone and password = :pk_password");
		query.setString("pk_phone", phone);
		query.setString("pk_password", password);
		List<User> list = query.list();
		return list;
	}
}

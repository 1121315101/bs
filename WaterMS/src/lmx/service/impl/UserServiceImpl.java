package lmx.service.impl;

import java.util.List;

import lmx.dao.UserDao;
import lmx.entities.User;
import lmx.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDaoImpl;
	
	/* (non-Javadoc)
	 * @see lmx.service.impl.UserService#find(java.lang.String, java.lang.String)
	 */
	@Override
	public long find(String phone,String password){
		List<User> list = userDaoImpl.listUser(phone, password);
		if(list.size() < 1){
			return -1;
		}else{
			return list.get(0).getUserid();
		}
	}
}

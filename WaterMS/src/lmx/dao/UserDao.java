package lmx.dao;

import java.util.List;

import lmx.entities.User;

public interface UserDao {

	public abstract List<User> listUser(String phone, String password);

}
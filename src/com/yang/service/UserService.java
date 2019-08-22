package com.yang.service;

import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;
import com.yang.dto.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImpl();
		return dao.login(user);
	}
	public User register(User user) {
		UserDao dao = new UserDaoImpl();
		return dao.register(user);
	}
	public void addMessage(String from, String sendTime, String content) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		dao.addMessage( from,  sendTime,  content);
	}
	public boolean getShield(String content) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		return dao.getShield( content);
	}
}

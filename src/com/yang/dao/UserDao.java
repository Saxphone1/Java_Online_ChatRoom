package com.yang.dao;

import com.yang.dto.User;

public interface UserDao {

	abstract User login(User user);
	
	abstract User register(User user);

	abstract void addMessage(String from, String sendTime, String content);

	abstract boolean getShield(String content);
}

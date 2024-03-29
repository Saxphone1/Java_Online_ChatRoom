package com.yang.dto;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {

	private int id;
	private String username;
	private String password;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public  void valueBound(HttpSessionBindingEvent event) {
		System.out.println("进入了");
		HttpSession session = event.getSession();
		Map<User, HttpSession> userMap = (Map<User, HttpSession>) event.getSession().getServletContext().getAttribute("userMap");
		
		userMap.put(this, session);
	}
 
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("退出了");
		HttpSession session = event.getSession();
		Map<User, HttpSession> userMap = (Map<User, HttpSession>) event.getSession().getServletContext().getAttribute("userMap");
		
		userMap.remove(this);
	}
}

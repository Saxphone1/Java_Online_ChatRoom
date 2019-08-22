package com.yang.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.yang.dto.Shield;
import com.yang.dto.User;
import com.yang.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public User login(User user) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		String sql = "select * from user where username = ? and password = ?";
		User existUser = null;
		try {
			existUser = queryRunner.query(sql, new BeanHandler<User>(User.class), user.getUsername(),user.getPassword());
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return existUser;
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		String sql = "insert into user(username,password,type) values(?,?,?)";
		User existUser = null;
		Object[] params={user.getUsername(),user.getPassword(),"user"};
		
		try {
			queryRunner.update(sql,params);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addMessage(String from, String sendTime, String content) {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		String sql = "insert into message(username,addtime,content) values(?,?,?)";
		
		Object[] params={from,sendTime,content};
		
		try {
			queryRunner.update(sql,params);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean getShield(String content) {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		String sql = "select * from shield where word = ?";
		Shield existUser = null;
		try {
			existUser = queryRunner.query(sql,new BeanHandler<Shield>(Shield.class), content);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(existUser==null) {
			return true;
		}
		return false;
	}

}

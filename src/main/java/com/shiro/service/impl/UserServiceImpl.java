package com.shiro.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.shiro.dao.UserDao;
import com.shiro.model.UserInfo;
import com.shiro.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Resource
	UserDao userDao;

	public List<UserInfo> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(UserInfo user) {
		// TODO Auto-generated method stub
		
	}

	public void changePassword(long userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	public void addUserRole(long userId, long roleId) {
		// TODO Auto-generated method stub
		
	}

	public void addUserRoles(long userId, List<Long> roleIds) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserRole(long userId, long roleId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserRoles(long userId, List<Long> roleIds) {
		// TODO Auto-generated method stub
		
	}

	
}

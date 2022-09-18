package com.cg.service;

import com.cg.dao.IUserDao;
import com.cg.dao.UserDaoImp;
import com.cg.entites.User;

public class UserServiceImp implements IUserService{
	
	private IUserDao dao;
	
	public UserServiceImp() {
		super();
		dao=new UserDaoImp();
	}

	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		
		return null;
	}

	@Override
	public boolean logout() {
	
		return false;
	}


}

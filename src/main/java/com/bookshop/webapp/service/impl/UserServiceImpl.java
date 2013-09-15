package com.bookshop.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.webapp.dao.UserDao;
import com.bookshop.webapp.model.User;
import com.bookshop.webapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDao userDao;
	
	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(Integer userId) {
		userDao.deleteUser(userId);
	}

	@Override
	@Transactional
	public User getUser(Integer userId) {
		return userDao.getUser(userId);
	}

	@Override
	@Transactional
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}

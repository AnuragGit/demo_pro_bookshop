package com.bookshop.webapp.dao;

import java.util.List;

import com.bookshop.webapp.model.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public void deleteUser(Integer userId);
	
	public User getUser(Integer userId);
	
	public List<User> getUserList();
	
	public User getUserByUsername(String username);
	

}

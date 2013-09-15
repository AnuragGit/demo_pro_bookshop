package com.bookshop.webapp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.UserDao;
import com.bookshop.webapp.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired SessionFactory factory;
	
	@Override
	public void saveUser(User user) {
		factory.getCurrentSession().merge(user);		
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = getUser(userId);
		if(user != null){
			factory.getCurrentSession().delete(user);
		}
	}

	@Override
	public User getUser(Integer userId) {
		User user = (User)factory.getCurrentSession().get(User.class, userId);
		return user;
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> getUserList() {
		List<User> userList = factory.getCurrentSession().createQuery("From User").list();
		return userList;
	}

	@Override
	public User getUserByUsername(String username) {
		User user = (User) factory.getCurrentSession()
				.createQuery("From User where username =:username")
				.setParameter("username", username).uniqueResult();

		return user;
	}

}

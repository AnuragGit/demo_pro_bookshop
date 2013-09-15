package com.bookshop.webapp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.CategoryDao;
import com.bookshop.webapp.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao{

	@Autowired SessionFactory factory;
	
	@Override
	public void saveCategory(Category category) {
		factory.getCurrentSession().merge(category);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = getCategory(categoryId);
		if(category != null){
			factory.getCurrentSession().delete(category);
		}
	}

	@Override
	public Category getCategory(Integer categoryId) {
		Category category = (Category)factory.getCurrentSession().get(Category.class, categoryId);
		return category;
	}

	@Override
	@SuppressWarnings("unchecked")	
	public List<Category> getCategoryList() {
        List<Category> categoryLIst =factory.getCurrentSession().createQuery("From Category").list(); 
		return categoryLIst;
	}	
	

}

package com.bookshop.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.webapp.dao.CategoryDao;
import com.bookshop.webapp.model.Category;
import com.bookshop.webapp.service.CategoryService;

@Service
public class CateogryServiceImpl implements CategoryService {

	@Autowired CategoryDao categoryDao;
	
	@Override
	@Transactional
	public void saveCategory(Category category) {
		categoryDao.saveCategory(category);
	}

	@Override
	@Transactional
	public void deleteCategory(Integer categoryId) {
		categoryDao.deleteCategory(categoryId);
	}

	@Override
	@Transactional
	public Category getCategory(Integer categoryId) {
		return categoryDao.getCategory(categoryId);
	}

	@Override
	@Transactional
	public List<Category> getCategoryList() {
		return categoryDao.getCategoryList();
	}

}

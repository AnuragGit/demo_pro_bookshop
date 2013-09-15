package com.bookshop.webapp.dao;

import java.util.List;

import com.bookshop.webapp.model.Category;

public interface CategoryDao {
	
	public void saveCategory(Category category);
	
	public void deleteCategory(Integer categoryId);
	
	public Category getCategory(Integer categoryId);
	
	public List<Category> getCategoryList();

}

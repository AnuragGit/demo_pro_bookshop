package com.bookshop.webapp.service;

import java.util.List;

import com.bookshop.webapp.model.Category;

public interface CategoryService {

	public void saveCategory(Category category);

	public void deleteCategory(Integer categoryId);

	public Category getCategory(Integer categoryId);

	public List<Category> getCategoryList();

}

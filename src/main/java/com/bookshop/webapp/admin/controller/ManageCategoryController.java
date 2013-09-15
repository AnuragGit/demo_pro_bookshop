package com.bookshop.webapp.admin.controller;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookshop.webapp.controller.CommonController;
import com.bookshop.webapp.model.Category;

@Controller
@RequestMapping("/admin")
public class ManageCategoryController extends CommonController {
	
	@RequestMapping(value="/managecategory",method=RequestMethod.GET)
	public String showManageCategory(Model model){
		
		model.addAttribute("category", new Category());
		model.addAttribute("page", "managecategory");
		
		return "managecategory";
	}
	
	@RequestMapping(value="/managecategory",method=RequestMethod.POST)
	public String manageCategoryProcess(@ModelAttribute Category category,BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("category", new Category());
			model.addAttribute("page", "managecategory");
		} else {

			try {
				categoryService.saveCategory(category);
			} catch (ConstraintViolationException e) {
				model.addAttribute("dbError", e.getMessage());
			}

		}

		return "managecategory";
	}


	@RequestMapping(value="/editcategory/{categoryId}",method=RequestMethod.GET)
	public String editcategory(@PathVariable Integer categoryId, Model model) {

		Category category = categoryService.getCategory(categoryId);
		model.addAttribute("category", category);
		model.addAttribute("page", "managecategory");

		return "managecategory";
	}
	
	@RequestMapping(value="/deletecategory/{categoryId}",method=RequestMethod.GET)
	public String deletecategory(@PathVariable Integer categoryId, Model model) {
		try {
			categoryService.deleteCategory(categoryId);
		} catch (DataIntegrityViolationException ex) {
			model.addAttribute("dbError", ex.getMessage());
		}
		model.addAttribute("category", new Category());
		model.addAttribute("page", "managecategory");

		return "managecategory";
	}

}

package com.bookshop.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String showHomepage(Model model){
		
		logger.info("Hi, {}", "inside Homepage");
		return "redirect:/home";
		
	}
	
	@RequestMapping("/home")
	public String showHome(Model model){
		
		logger.info("Hello, {}", "inside Homepage");
		return "index";
		
	}
	
	
}

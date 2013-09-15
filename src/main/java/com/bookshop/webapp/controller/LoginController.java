package com.bookshop.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showloginpage(Model model){
		
		logger.info("Hi, {}", "inside showloginpage");
		return "login";
		
	}
	
	@RequestMapping(value="/loginFailed",method=RequestMethod.GET)
	public String showloginFailedpage(Model model){
		
		logger.info("Hi, {}", "inside showloginpage");
		return "login";
		
	}

}

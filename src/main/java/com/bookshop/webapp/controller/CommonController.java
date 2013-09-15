package com.bookshop.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import com.bookshop.webapp.service.CategoryService;
import com.bookshop.webapp.service.CityService;
import com.bookshop.webapp.service.CountryService;
import com.bookshop.webapp.service.StateService;

public class CommonController implements MessageSourceAware  {
	
	@Autowired
	protected CountryService countryService;
	
	@Autowired
	protected StateService stateService;

	@Autowired
	protected CityService cityService;

	@Autowired
	protected CategoryService categoryService;


	private MessageSource messageSource;
	@Override
	public void setMessageSource(MessageSource source) {
		this.messageSource = source;
		
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}	
	

}

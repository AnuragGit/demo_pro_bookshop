package com.bookshop.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.webapp.dao.CountryDao;
import com.bookshop.webapp.model.Country;
import com.bookshop.webapp.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired CountryDao countryDao;

	
	@Override
	@Transactional
	public void saveCountry(Country country) {
		countryDao.saveCountry(country);
	}

	@Override
	@Transactional
	public void deleteCountry(Integer countryId) {
		countryDao.deleteCountry(countryId);
	}

	@Override
	@Transactional
	public Country getCountry(Integer countryId) {
		return countryDao.getCountry(countryId);
	}

	@Override
	@Transactional
	public List<Country> getCountryList() {
		return countryDao.getCountryList();
	}

}

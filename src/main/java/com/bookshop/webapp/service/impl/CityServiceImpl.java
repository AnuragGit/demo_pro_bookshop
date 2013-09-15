package com.bookshop.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.webapp.dao.CityDao;
import com.bookshop.webapp.model.City;
import com.bookshop.webapp.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired CityDao cityDao;

	@Override
	@Transactional
	public void saveCity(City city) {
		cityDao.saveCity(city);
	}

	@Override
	@Transactional
	public void deleteCity(Integer cityId) {
		cityDao.deleteCity(cityId);
	}

	@Override
	@Transactional
	public City getCity(Integer cityId) {
		return cityDao.getCity(cityId);
	}

	@Override
	@Transactional
	public List<City> getCityList() {
		return cityDao.getCityList();
	}

}

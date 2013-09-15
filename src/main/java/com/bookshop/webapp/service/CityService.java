package com.bookshop.webapp.service;

import java.util.List;

import com.bookshop.webapp.model.City;

public interface CityService {

	public void saveCity(City city);

	public void deleteCity(Integer cityId);

	public City getCity(Integer cityId);

	public List<City> getCityList();

}

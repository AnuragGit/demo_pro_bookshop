package com.bookshop.webapp.dao;

import java.util.List;

import com.bookshop.webapp.model.City;

public interface CityDao {

	public void saveCity(City city);

	public void deleteCity(Integer cityId);

	public City getCity(Integer cityId);

	public List<City> getCityList();

}

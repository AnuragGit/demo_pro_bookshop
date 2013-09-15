package com.bookshop.webapp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.CityDao;
import com.bookshop.webapp.model.City;

@Repository
public class CityDaoImpl implements CityDao {

	@Autowired SessionFactory factory;
	
	@Override
	public void saveCity(City city) {
		factory.getCurrentSession().merge(city);		
	}

	@Override
	public void deleteCity(Integer cityId) {
		City city = getCity(cityId);
		if(city!=null){
			factory.getCurrentSession().delete(city);
		}
		
	}

	@Override
	public City getCity(Integer cityId) {
		City city = (City) factory.getCurrentSession().get(City.class, cityId);
		return city;
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<City> getCityList() {
		List<City> cityList = factory.getCurrentSession().createQuery("From City").list();
		return cityList;
	}

}

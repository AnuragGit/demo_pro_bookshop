package com.bookshop.webapp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.CountryDao;
import com.bookshop.webapp.model.Country;

@Repository
public class CountryDaoImpl implements CountryDao {

	@Autowired SessionFactory factory;
	
	@Override
	public void saveCountry(Country country) {
		factory.getCurrentSession().merge(country);
	}

	@Override
	public void deleteCountry(Integer countryId) {
		Country country = getCountry(countryId);
		if(country!=null){
			factory.getCurrentSession().delete(country);
		}
	}

	@Override
	public Country getCountry(Integer countryId) {
		Country country = (Country) factory.getCurrentSession().get(Country.class, countryId);
		return country;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Country> getCountryList() {
		List<Country> countryList = factory.getCurrentSession().createQuery("from Country").list();
		return countryList;
	}

}

package com.bookshop.webapp.dao;

import java.util.List;

import com.bookshop.webapp.model.Country;

public interface CountryDao {

	public void saveCountry(Country country);

	public void deleteCountry(Integer countryId);

	public Country getCountry(Integer countryId);

	public List<Country> getCountryList();
}

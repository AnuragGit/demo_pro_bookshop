package com.bookshop.webapp.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Collections;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer countryId;
	private String countryName;
	private Set<State> states = Collections.emptySet();
	private Set<User> users = Collections.emptySet();
	private Set<Author> authors = Collections.emptySet();
	private Set<Publisher> publishers = Collections.emptySet();

	public Country() {
	}

	public Country(String countryName, Set<State> states, Set<User> users,
			Set<Author> authors, Set<Publisher> publishers) {
		this.countryName = countryName;
		this.states = states;
		this.users = users;
		this.authors = authors;
		this.publishers = publishers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CountryID", unique = true, nullable = false)
	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "CountryName", length = 45)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<State> getStates() {
		return this.states;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<Author> getAuthors() {
		return this.authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<Publisher> getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

}

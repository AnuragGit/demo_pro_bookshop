package com.bookshop.webapp.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Collections;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer cityId;
	private State state;
	private String cityName;
	private Set<Publisher> publishers = Collections.emptySet();
	private Set<User> users = Collections.emptySet();
	private Set<Author> authors = Collections.emptySet();

	public City() {
	}

	public City(State state, String cityName) {
		this.state = state;
		this.cityName = cityName;
	}

	public City(State state, String cityName, Set<Publisher> publishers,
			Set<User> users, Set<Author> authors) {
		this.state = state;
		this.cityName = cityName;
		this.publishers = publishers;
		this.users = users;
		this.authors = authors;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CityID")
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StateID")
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Column(name = "CityName")
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Publisher> getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Author> getAuthors() {
		return this.authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}

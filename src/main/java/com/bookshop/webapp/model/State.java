package com.bookshop.webapp.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "state")
public class State implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer stateId;
	private Country country;
	private String stateName;
	private Set<City> cities = new HashSet<City>(0);
	private Set<User> users = new HashSet<User>(0);
	private Set<Publisher> publishers = new HashSet<Publisher>(0);
	private Set<Author> authors = new HashSet<Author>(0);

	public State() {
	}

	public State(Country country, String stateName, Set<City> cities,
			Set<User> users, Set<Publisher> publishers, Set<Author> authors) {
		this.country = country;
		this.stateName = stateName;
		this.cities = cities;
		this.users = users;
		this.publishers = publishers;
		this.authors = authors;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "StateID", unique = true, nullable = false)
	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CountryID")
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "StateName", length = 45)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<Publisher> getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<Author> getAuthors() {
		return this.authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}

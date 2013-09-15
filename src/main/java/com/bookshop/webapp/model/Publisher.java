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
@Table(name = "publisher")
public class Publisher implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer publisherId;
	private State state;
	private Country country;
	private City city;
	private String publisherName;
	private String address1;
	private String address2;
	private String pinCode;
	private String emailAddress;
	private Set<Book> books = Collections.emptySet();

	public Publisher() {
	}

	public Publisher(State state, Country country, City city,
			String publisherName, String address1, String address2,
			String pinCode, String emailAddress) {
		this.state = state;
		this.country = country;
		this.city = city;
		this.publisherName = publisherName;
		this.address1 = address1;
		this.address2 = address2;
		this.pinCode = pinCode;
		this.emailAddress = emailAddress;
	}

	public Publisher(State state, Country country, City city,
			String publisherName, String address1, String address2,
			String pinCode, String emailAddress, Set<Book> books) {
		this.state = state;
		this.country = country;
		this.city = city;
		this.publisherName = publisherName;
		this.address1 = address1;
		this.address2 = address2;
		this.pinCode = pinCode;
		this.emailAddress = emailAddress;
		this.books = books;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PublisherID")
	public Integer getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StateID")
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CountryID")
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CityID")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "PublisherName")
	public String getPublisherName() {
		return this.publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Column(name = "Address1")
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "Address2")
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "PinCode")
	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "EmailAddress")
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}

package com.bookshop.webapp.model;
import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Blob;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "author")
public class Author implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer authorId;
	private State state;
	private Country country;
	private City city;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String pinCode;
	private String degree;
	private String emailAddress;
	private Blob photograph;
	private String speciality;
	private Date dob;
	private Set<Book> booksForAuthor1id = Collections.emptySet();
	private Set<Book> booksForAuthor4id = Collections.emptySet();
	private Set<Book> booksForAuthor3id = Collections.emptySet();
	private Set<Book> booksForAuthor2id = Collections.emptySet();

	public Author() {
	}

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AuthorID")
	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
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

	@Column(name = "FirstName")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Column(name = "Degree")
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "EmailAddress")
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Lob
	@Column(name = "Photograph")
	public Blob getPhotograph() {
		return this.photograph;
	}

	public void setPhotograph(Blob photograph) {
		this.photograph = photograph;
	}

	@Column(name = "Speciality")
	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB")
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authorByAuthor1id")
	public Set<Book> getBooksForAuthor1id() {
		return this.booksForAuthor1id;
	}

	public void setBooksForAuthor1id(Set<Book> booksForAuthor1id) {
		this.booksForAuthor1id = booksForAuthor1id;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authorByAuthor4id")
	public Set<Book> getBooksForAuthor4id() {
		return this.booksForAuthor4id;
	}

	public void setBooksForAuthor4id(Set<Book> booksForAuthor4id) {
		this.booksForAuthor4id = booksForAuthor4id;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authorByAuthor3id")
	public Set<Book> getBooksForAuthor3id() {
		return this.booksForAuthor3id;
	}

	public void setBooksForAuthor3id(Set<Book> booksForAuthor3id) {
		this.booksForAuthor3id = booksForAuthor3id;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authorByAuthor2id")
	public Set<Book> getBooksForAuthor2id() {
		return this.booksForAuthor2id;
	}

	public void setBooksForAuthor2id(Set<Book> booksForAuthor2id) {
		this.booksForAuthor2id = booksForAuthor2id;
	}

}

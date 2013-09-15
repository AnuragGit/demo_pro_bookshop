package com.bookshop.webapp.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "user",uniqueConstraints = {
		@UniqueConstraint(columnNames = "EmailAddress"),
		@UniqueConstraint(columnNames = "Username") })
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private State state;
	private Country country;
	private City city;
	private String username;
	private String password;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String pinCode;
	private Date dob;
	private Boolean newRelease;
	private Boolean bookUpdates;
	private Boolean enabled;
	private Boolean column17;
	private String authority;

	public User() {
	}

	public User(String username, String emailAddress) {
		this.username = username;
		this.emailAddress = emailAddress;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UserID")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	@Column(name = "Username", unique = true, nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "Password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EmailAddress", unique = true, nullable = false, length = 45)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "FirstName", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "Address1", length = 45)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "Address2", length = 45)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "PinCode", length = 50)
	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB", length = 19)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "NewRelease")
	public Boolean getNewRelease() {
		return this.newRelease;
	}

	public void setNewRelease(Boolean newRelease) {
		this.newRelease = newRelease;
	}

	@Column(name = "BookUpdates")
	public Boolean getBookUpdates() {
		return this.bookUpdates;
	}

	public void setBookUpdates(Boolean bookUpdates) {
		this.bookUpdates = bookUpdates;
	}

	@Column(name = "Enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "Column 17")
	public Boolean getColumn17() {
		return this.column17;
	}

	public void setColumn17(Boolean column17) {
		this.column17 = column17;
	}

	@Column(name = "Authority", length = 50)
	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}

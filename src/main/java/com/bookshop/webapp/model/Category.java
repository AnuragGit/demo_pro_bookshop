package com.bookshop.webapp.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer categoryId;
	private String categoryName;
	private String categoryDesc;
	private Set<Book> books = new HashSet<Book>(0);

	public Category() {
	}

	public Category(String categoryName, String categoryDesc) {
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
	}

	public Category(String categoryName, String categoryDesc, Set<Book> books) {
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		this.books = books;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CategoryID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "CategoryName", nullable = false, length = 50)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "CategoryDesc", nullable = false, length = 150)
	public String getCategoryDesc() {
		return this.categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}

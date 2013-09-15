package com.bookshop.webapp.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "book", uniqueConstraints = @UniqueConstraint(columnNames = "ISBN"))
public class Book implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer bookId;
	private Publisher publisher;
	private Category category;
	private Author authorByAuthor1id;
	private Author authorByAuthor2id;
	private Author authorByAuthor4id;
	private Author authorByAuthor3id;
	private String bookName;
	private Blob coverPage;
	private String isbn;
	private String edition;
	private int year;
	private int cost;
	private String synopsis;
	private String aboutAthor;
	private String topicsCovered;
	private String contentsCdrom;
	private Blob toc;
	private Blob sampleChapter;
	private int hits;

	public Book() {
	}

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "BookID")
	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PublisherID", nullable = false)
	public Publisher getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CategoryID")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Author1ID")
	public Author getAuthorByAuthor1id() {
		return this.authorByAuthor1id;
	}

	public void setAuthorByAuthor1id(Author authorByAuthor1id) {
		this.authorByAuthor1id = authorByAuthor1id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Author2ID")
	public Author getAuthorByAuthor2id() {
		return this.authorByAuthor2id;
	}

	public void setAuthorByAuthor2id(Author authorByAuthor2id) {
		this.authorByAuthor2id = authorByAuthor2id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Author4ID", nullable = false)
	public Author getAuthorByAuthor4id() {
		return this.authorByAuthor4id;
	}

	public void setAuthorByAuthor4id(Author authorByAuthor4id) {
		this.authorByAuthor4id = authorByAuthor4id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Author3ID", nullable = false)
	public Author getAuthorByAuthor3id() {
		return this.authorByAuthor3id;
	}

	public void setAuthorByAuthor3id(Author authorByAuthor3id) {
		this.authorByAuthor3id = authorByAuthor3id;
	}

	@Column(name = "BookName", nullable = false, length = 50)
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Lob
	@Column(name = "CoverPage", nullable = false)
	public Blob getCoverPage() {
		return this.coverPage;
	}

	public void setCoverPage(Blob coverPage) {
		this.coverPage = coverPage;
	}

	@Column(name = "ISBN", unique = true, nullable = false, length = 50)
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "Edition", nullable = false, length = 50)
	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	@Column(name = "Year", nullable = false)
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Column(name = "Cost", nullable = false)
	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Column(name = "Synopsis", nullable = false, length = 4000)
	public String getSynopsis() {
		return this.synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Column(name = "AboutAthor", nullable = false, length = 4000)
	public String getAboutAthor() {
		return this.aboutAthor;
	}

	public void setAboutAthor(String aboutAthor) {
		this.aboutAthor = aboutAthor;
	}

	@Column(name = "TopicsCovered", nullable = false, length = 4000)
	public String getTopicsCovered() {
		return this.topicsCovered;
	}

	public void setTopicsCovered(String topicsCovered) {
		this.topicsCovered = topicsCovered;
	}

	@Column(name = "ContentsCDROM", nullable = false, length = 4000)
	public String getContentsCdrom() {
		return this.contentsCdrom;
	}

	public void setContentsCdrom(String contentsCdrom) {
		this.contentsCdrom = contentsCdrom;
	}

	@Lob
	@Column(name = "TOC", nullable = false)
	public Blob getToc() {
		return this.toc;
	}

	public void setToc(Blob toc) {
		this.toc = toc;
	}

	@Lob
	@Column(name = "SampleChapter", nullable = false)
	public Blob getSampleChapter() {
		return this.sampleChapter;
	}

	public void setSampleChapter(Blob sampleChapter) {
		this.sampleChapter = sampleChapter;
	}

	@Column(name = "Hits", nullable = false)
	public int getHits() {
		return this.hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

}

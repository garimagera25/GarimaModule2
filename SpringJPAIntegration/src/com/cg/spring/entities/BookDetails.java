package com.cg.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
@SequenceGenerator(name="book_id_seq",sequenceName="bookid_seq")
public class BookDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="book_id_seq")
	@Column(name="book_id")
	private int bookId;
	
	private String title;
	
	@Column(name="author_id")
	private int authorId;
	
	private double price;
	
	@Column(name="pub_year")
	private int pubYear;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
	
}

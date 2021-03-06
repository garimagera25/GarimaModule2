package com.cg.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="author_id_seq",sequenceName="authorid_seq")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="author_id_seq")
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="author_name")
	private String authorName;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}

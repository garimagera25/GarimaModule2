package com.cg.spring.service;

import java.util.List;

import com.cg.spring.entities.Author;
import com.cg.spring.entities.BookDetails;

public interface BookService {

//	public List<Author> getAuthorList();
	public BookDetails addBookDetails(BookDetails book);
	public List<BookDetails> getBookList();
	public List<BookDetails> getBookList(int year1,int year2);
	public BookDetails getBookDetails(int bookid);
	
//	public BookDetails updateBook(BookDetails book);
	
	public void removeBook(int bookid);
	List<Author> getAuthorList();
	
	
}

package com.cg.spring.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.AuthorRepository;
import com.cg.spring.dao.BookRepository;
import com.cg.spring.entities.Author;
import com.cg.spring.entities.BookDetails;

@Transactional
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthorRepository authorRepository;
	
	public BookRepository getRepository() {
		return bookRepository;
	}


	public void setRepository(BookRepository repository) {
		this.bookRepository = repository;
	}


	@Override
	public List<Author> getAuthorList() {
		return authorRepository.findAll();
	}


	@Override
	public BookDetails addBookDetails(BookDetails book) {
		return bookRepository.saveAndFlush(book);
	}
	@Override
	public List<BookDetails> getBookList() {
	return	bookRepository.findAll();
	}


	@Override
	public BookDetails getBookDetails(int bookid) {
		
		return bookRepository.findOne(bookid);
	}


	/*@Override
	public BookDetails updateBook(BookDetails book) {
		return repository.
	}*/


	public void removeBook(int bookid) {
		// TODO Auto-generated method stub
		 bookRepository.delete(bookid);
		 
	}


	@Override
	public List<BookDetails> getBookList(int year1, int year2) {
	System.out.println("In service : "+ year1 + " " + year2);
		return bookRepository.getBookYearwise(year1, year2);
	}

}

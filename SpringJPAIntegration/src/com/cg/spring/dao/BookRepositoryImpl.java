/*package com.cg.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.spring.entities.Author;
import com.cg.spring.entities.BookDetails;

@Repository
public class BookRepositoryImpl implements BookRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Author> getAuthorList() {
		TypedQuery<Author> query=
				entityManager.createQuery(" from Author ", Author.class);
		List<Author> authorList = query.getResultList();
		return authorList;
	}

	@Override
	public BookDetails addBookDetails(BookDetails book) {
			entityManager.persist(book);
			entityManager.flush();
			return book;
	}
	@Override
	public List<BookDetails> getBookList() {
		List<BookDetails> list;
		TypedQuery<BookDetails> query=
		entityManager.createQuery(" from BookDetails", BookDetails.class);
		list= query.getResultList();
		return list;
	}
	@Override
	public BookDetails getBookDetails(int bookid) {
		BookDetails book= entityManager.find(BookDetails.class,bookid);
		return book;
		}
	@Override
	public BookDetails updateBook(BookDetails book) {
		entityManager.merge(book);
		entityManager.flush();
		return book;
	}
	@Override
	public BookDetails removeBook(int bookid) {
		BookDetails book= getBookDetails(bookid);
		entityManager.remove(book);
		entityManager.flush();
		return book;
	}

	
}
*/
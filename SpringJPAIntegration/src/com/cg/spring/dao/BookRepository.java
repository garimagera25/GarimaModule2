package com.cg.spring.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.spring.entities.Author;
import com.cg.spring.entities.BookDetails;

public interface BookRepository extends 
JpaRepository<BookDetails, Integer>{

	@Query("delete from BookDetails where pubYear <= :year")
	public void deleteBooks(@Param("year") int pubYear);
	@Query("select books from BookDetails books "
			+ "where books.pubYear between :year1 and :year2")	
	public List<BookDetails>  getBookYearwise(@Param("year1") int year1,@Param("year2") int year2);

}

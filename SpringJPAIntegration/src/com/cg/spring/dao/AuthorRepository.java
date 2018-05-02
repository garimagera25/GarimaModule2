package com.cg.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spring.entities.Author;

public interface AuthorRepository extends
JpaRepository<Author, Integer>{

	
}

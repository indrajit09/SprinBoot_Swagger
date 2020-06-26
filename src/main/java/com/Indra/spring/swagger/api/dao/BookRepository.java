package com.Indra.spring.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Indra.spring.swagger.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
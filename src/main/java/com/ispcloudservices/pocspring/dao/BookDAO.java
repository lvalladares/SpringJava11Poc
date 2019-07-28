package com.ispcloudservices.pocspring.dao;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

import com.ispcloudservices.pocspring.entity.Book;
import com.ispcloudservices.pocspring.helpers.Constants.Status;

public interface BookDAO extends DatastoreRepository<Book, Long> {

	Book findFirstByName(String name);
	
	List<Book> findByEditorialName(String name);
	
	List<Book> findFirst10ByYearAndPageCountAndGenresName(Long year, Integer pageCount, String name);
	
	List<Book> findByYearGreaterThan(int year);
	
	List<Book> findByStatus(Status status);
}

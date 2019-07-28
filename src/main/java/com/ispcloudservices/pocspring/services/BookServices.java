package com.ispcloudservices.pocspring.services;

import java.util.List;

import com.ispcloudservices.pocspring.entity.Book;
import com.ispcloudservices.pocspring.helpers.Constants.Status;

public interface BookServices {
	
	void createBook(Book book);
	
	void updateBookStatus(String name);
	
	List<Book> findBookByStatus(Status status);
	
	List<Book> findBookByEditorialName(String name);

}

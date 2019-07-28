package com.ispcloudservices.pocspring.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispcloudservices.pocspring.dao.BookDAO;
import com.ispcloudservices.pocspring.entity.Book;
import com.ispcloudservices.pocspring.helpers.Constants.Status;
import com.ispcloudservices.pocspring.services.BookServices;

@Service(value="bookservices")
public class BookServicesImpl implements BookServices {

	@Autowired
	private BookDAO bookDAO;
	
//	@Autowired
//	private final PubSubTemplate pubSubTemplate;
//
//	public BookServicesImpl(BookDAO bookDAO, PubSubTemplate pubSubTemplate) {
//		super();
//		this.bookDAO = bookDAO;
//		this.pubSubTemplate = pubSubTemplate;
//	}

	@Transactional
	public void createBook(Book book) {
		// book.setStatus(Status.PENDING);
		bookDAO.save(book);
//		pubSubTemplate.publish("booktest", book);
	}

	@Transactional
	public void updateBookStatus(String name) {
		Book book = bookDAO.findFirstByName(name);
		// book.setStatus(Status.READY);
		bookDAO.save(book);
	}

	@Transactional
	public List<Book> findBookByStatus(Status status) {
		return bookDAO.findByStatus(status);
	}

	@Transactional
	public List<Book> findBookByEditorialName(String name) {
		return bookDAO.findByEditorialName(name);
	}

}

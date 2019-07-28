package com.ispcloudservices.pocspring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ispcloudservices.pocspring.entity.Book;
import com.ispcloudservices.pocspring.helpers.Constants.Status;
import com.ispcloudservices.pocspring.services.BookServices;

@RestController
@RequestMapping("books")
public class BookController {
	
	private static final Log LOGGER = LogFactory.getLog(BookController.class);
	
	@Autowired
	BookServices bookServices;
	
	@PostMapping("/")
	public void createBook(@RequestBody Book book, HttpServletRequest request, 
			HttpServletResponse response) 
	{
		this.bookServices.createBook(book);
	}
	
	@GetMapping("/updateStatus")
	public void updateBook(@PathVariable String name, HttpServletRequest request, 
			HttpServletResponse response) 
	{
		this.bookServices.updateBookStatus(name);
	}
	
	@GetMapping("/findByStatus")
	public List<Book> findBookByStatus(@PathVariable Status status, HttpServletRequest request, 
			HttpServletResponse response) 
	{
		return this.bookServices.findBookByStatus(status);
	}
	
	@GetMapping("/findByEditorialName")
	public List<Book> findByEditorialName(HttpServletRequest request, HttpServletResponse response) 
	{
		String editorialName = request.getParameter("editorialName");
		return this.bookServices.findBookByEditorialName(editorialName);
	}
	
	@GetMapping("/hi")
	public String findBookByStatus(HttpServletRequest request, HttpServletResponse response) 
	{
		LOGGER.info("entro");
		return "Hola Mundo";
	}

}

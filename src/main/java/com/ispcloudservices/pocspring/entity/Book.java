package com.ispcloudservices.pocspring.entity;

import java.util.List;

import com.ispcloudservices.pocspring.helpers.Constants.Status;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Descendants;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Reference;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;


@Entity(name="books")
public class Book {
	
	@Id
	Long Id;
	
	String name;
	
	Long year;
	
	@Transient
	Integer yearsSincePublication;
	
	Status status;
	
	@Field(name= "page_count")
	Integer pageCount;

	Editorial editorial;
	
	@Reference
	List<Author> authors;
	
	@Descendants
	List<Genre> genres;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public Integer getYearsSincePublication() {
		return yearsSincePublication;
	}

	public void setYearsSincePublication(Integer yearsSincePublication) {
		this.yearsSincePublication = yearsSincePublication;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	
	
}

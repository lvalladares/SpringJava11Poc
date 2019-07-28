package com.ispcloudservices.pocspring.entity;

import java.util.Date;
import java.util.List;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import com.google.cloud.datastore.Key;

@Entity(name="authors")
public class Author {

	@Id
	Key authorKey;
	
	String name;
	
	@Field(name = "last_name")
	String lastName;
	
	String nationality;
	
	@Field(name = "birth_date")
	Date dateOfBirth;
	
	List<Book> books;
	
	@Transient
	Integer age;

	public Key getAuthorKey() {
		return authorKey;
	}

	public void setAuthorKey(Key authorKey) {
		this.authorKey = authorKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

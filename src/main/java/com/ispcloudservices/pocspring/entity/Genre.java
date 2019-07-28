package com.ispcloudservices.pocspring.entity;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import com.google.cloud.datastore.Key;

@Entity(name="genres")
public class Genre {
	
	@Id
	Key genreKey;
	
	String name;

	public Key getGenreKey() {
		return genreKey;
	}

	public void setGenreKey(Key genreKey) {
		this.genreKey = genreKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

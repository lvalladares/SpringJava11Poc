package com.ispcloudservices.pocspring.dao;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

import com.google.cloud.datastore.Key;
import com.ispcloudservices.pocspring.entity.Author;

public interface AuthorDAO extends DatastoreRepository<Author, Key> {

}

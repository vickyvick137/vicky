package com.lti.springMvcCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.springMvcCrud.entity.Author;
import com.lti.springMvcCrud.entity.User;

@Repository
public interface UserRepository extends 
CrudRepository<Author, Long>{
	
}
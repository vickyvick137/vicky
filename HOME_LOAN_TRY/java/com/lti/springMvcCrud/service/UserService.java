package com.lti.springMvcCrud.service;

import java.util.List;

import com.lti.springMvcCrud.entity.Author;
import com.lti.springMvcCrud.entity.User;

public interface UserService {

	public List<Author> getAllUsers();
	public Author getUserById(Long id);
	public boolean saveUser(Author user);
	public boolean deleteUserById(Long id);

}
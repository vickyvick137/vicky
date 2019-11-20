package com.lti.springMvcCrud.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.springMvcCrud.entity.Author;
import com.lti.springMvcCrud.entity.User;
import com.lti.springMvcCrud.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
		// Implementing Constructor based DI
		private UserRepository repository;
		
		public UserServiceImpl() {
			
		}
		
		@Autowired
		public UserServiceImpl(UserRepository repository) {
			super();
			this.repository = repository;
		}
		
	@Override
	public List<Author> getAllUsers() {
		List<Author> list = new ArrayList<Author>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Author getUserById(Long id) {
		Author user = repository.findById(id).get();
		return user;
	}

	@Override
	public boolean saveUser(Author user) {
		try {
			repository.save(user);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteUserById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			return false;
		}
		
	}

}

package com.lti.Home_Loan.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lti.Home_Loan.entity.Register;
import com.lti.Home_Loan.repository.RegisterRepository;


@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
	// Implementing Constructor based DI
	private RegisterRepository repository;
	
	public RegisterServiceImpl() {
		
	}
	
	@Autowired
	public RegisterServiceImpl(RegisterRepository repository) {
		super();
		this.repository = repository;
	}
	
/*@Override
public List<Author> getAllUsers() {
	List<Author> list = new ArrayList<Author>();
	repository.findAll().forEach(e -> list.add(e));
	return list;
}

@Override
public Author getUserById(Long id) {
	Author user = repository.findById(id).get();
	return user;
}*/

@Override
public boolean saveUser(Register register) {
	try {
		repository.save(register);
		return true;
	}catch(Exception ex) {
		return false;
	}
}

/*@Override
public boolean deleteUserById(Long id) {
	try {
		repository.deleteById(id);
		return true;
	}catch(Exception ex) {
		return false;
	}
	
}*/

}

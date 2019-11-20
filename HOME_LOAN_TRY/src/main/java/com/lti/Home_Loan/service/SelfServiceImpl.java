package com.lti.Home_Loan.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Home_Loan.entity.Register;
import com.lti.Home_Loan.entity.Self;
import com.lti.Home_Loan.repository.RegisterRepository;
import com.lti.Home_Loan.repository.SelfRepository;

@Service
@Transactional
public class SelfServiceImpl implements SelfService{
private SelfRepository repository;
	
	public SelfServiceImpl() {
		
	}
	
	@Autowired
	public SelfServiceImpl(SelfRepository repository) {
		super();
		this.repository = repository;
	}
	
@Override
	public boolean saveUser(Self self) {
		try {
			repository.save(self);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}



package com.lti.Home_Loan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.Home_Loan.entity.Register;

@Repository
public interface RegisterRepository extends 
CrudRepository<Register,Long>{
	
}
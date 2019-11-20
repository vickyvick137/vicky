package com.lti.Home_Loan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.Home_Loan.entity.Register;
import com.lti.Home_Loan.entity.Self;

@Repository
public interface SelfRepository extends 
CrudRepository<Self,Long>{

}

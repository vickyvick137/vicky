package com.lti.Home_Loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="self_income")
public class Self {
	
	private int id;
    private String businesstype;
    private long turnover;
    private String business_name;
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="application-no")
	@SequenceGenerator(name="application-no",sequenceName="app1_no",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusinesstype() {
		return businesstype;
	}
	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}
	public long getTurnover() {
		return turnover;
	}
	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	@Override
	public String toString() {
		return "Self [id=" + id + ", businesstype=" + businesstype + ", turnover=" + turnover + ", business_name="
				+ business_name + "]";
	}

}

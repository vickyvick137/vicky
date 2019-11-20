package com.lti.Home_Loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="registration_details")
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="application-no")
	@SequenceGenerator(name="application-no",sequenceName="app_no",allocationSize=1)
	private long Application_no;
	private String UserName;
	private long Mobile_no;
	private String email_id;
	private String Password;
	public long getApplication_no() {
		return Application_no;
	}
	public void setApplication_no(long application_no) {
		Application_no = application_no;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Register [Application_no=" + Application_no + ", UserName=" + UserName + ", Mobile_no=" + Mobile_no
				+ ", email_id=" + email_id + ", Password=" + Password + "]";
	}
	


}

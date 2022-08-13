package com.student.managment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="studentinfo")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
	@Column(name ="student_name" , nullable=false)
	private String studName;
	
	@Column(name="studentlastName")
	private String stutLastname;
	
	@Column(name="emailId")
	private String emailId;
	
	private String transactionResponse;
	
	public Student( )
	{
		
	}
	
	
	public Student(String studName, String stutLastname, String emailId) {
		super();
		this.studName = studName;
		this.stutLastname = stutLastname;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStutLastname() {
		return stutLastname;
	}
	public void setStutLastname(String stutLastname) {
		this.stutLastname = stutLastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getTransactionResponse() {
		return transactionResponse;
	}


	public void setTransactionResponse(String transactionResponse) {
		this.transactionResponse = transactionResponse;
	}
	

	
}

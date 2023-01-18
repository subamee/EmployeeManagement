package com.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	
	@Column (name = "phone_no")
	private Long phone_no;
	
	@Column (name ="salary")
	private Long salary;
	
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId, Long phone_no, Long salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone_no= phone_no;
		this.salary= salary;
		
	}
	public Long getId() { 
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
		
	}
	public Long getphone_no() {
		return phone_no;
	}
	public void setphone_no(Long phone_no) {
		this.phone_no = phone_no;
}
	public Long getsalary() {
		return salary;
	}
	public void setsalary(Long salary) {
		this.salary = salary;
	}
	
}

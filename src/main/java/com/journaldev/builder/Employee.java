package com.journaldev.builder;

import java.util.Date;

public class Employee {

	private String empId;
	 private String firstName;
	 private String lastname;
	 private Date dob;
	 private String phoneNo;
	 
	 
	 
	public Employee() {
		super();
	}
	public Employee(String empId, String firstName, String lastname, Date dob, String phoneNo) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastname=" + lastname + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	 
}

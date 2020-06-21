package com.journaldev.builder;

import java.util.Date;

public class TestBuilderApp {
	public static void main(String[] args) {
		Employee e = new Employee("x", "y", "z", new Date(), "12345");
		Employee e1 = new Employee("y", "x", "z", new Date(), "12345");
		Employee obj = new Employee();
		obj.setDob(new Date());
		obj.setEmpId("x");
		obj.setFirstName("y");
		obj.setLastname("z");
		obj.setPhoneNo("12345");
		System.out.println("obj : "+obj);
		
		
		EmployeeBuilder empBuilder = new EmployeeBuilder()
				.withDob(new Date())
				.withEmpId("x")
				.withFirstName("y")
				.withLastName("z")
				.withPhoneNo("12345");
		System.out.println("empBuilder : "+empBuilder);
		
		
		EmployeeWithoutLombok emp = new EmployeeWithoutLombok("y", "x", "z", new Date(), "12345");
		
				
				
	}
}

package com.journaldev.builder;

import java.util.Date;

public class TestBuilder {

	public static void main(String[] args) {
		
		EmployeeBuilder empm= new EmployeeBuilder("x","ln",new Date(),"fn","453453");
		
		EmployeeBuilder empBuilder = new EmployeeBuilder()
				.withDob(new Date())
				.withEmpId("x")
				.withFirstName("y")
				.withLastName("z")
				.withPhoneNo("12345");
		System.out.println("empBuilder : "+empBuilder);
		
		
		EmployeeWithLombok emp = new EmployeeWithLombok();
		emp.setEmpId("1");
		emp.getEmpId();
		Employee e = new Employee();
		
		
		
		
		
		
		e.setDob(new Date());
		e.setEmpId("1");
		String estr= e.toString();
		System.out.println("estr : "+estr);
		System.out.println("e is "+e);
		Integer i = 7;
		Integer j = 3;
//		73
		System.out.println(i.toString()+j);
		System.out.println(i+j);
		String s = i.toString();
		System.out.println(s+j);
		
	}
}

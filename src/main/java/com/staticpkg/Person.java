package com.staticpkg;

public class Person {
	
	{
		personcount=10;
	}
	 static {
		personcount=10;
	}
	
	private static int personcount=1000;
	{
		personcount=30;
	}
	 static {
		personcount=40;
	}
	 
	 public static void main(String[] args) {
		System.out.println(Person.personcount);
		Person p = new Person();
		System.out.println(Person.personcount);
		Person.personcount=1000;
		p = new Person();
		System.out.println(Person.personcount);
		
	}
	
}

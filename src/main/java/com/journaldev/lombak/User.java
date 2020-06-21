package com.journaldev.lombak;

public class User {
	 private Long id; // will be set when persisting
	 
	    private String firstName;
	    private String lastName;
	    private int age;
	 
	    public User() {
	    }
	 
	    public User(String firstName, String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }
	 
	    // getters and setters: ~30 extra lines of code
}

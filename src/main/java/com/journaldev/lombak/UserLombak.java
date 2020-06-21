package com.journaldev.lombak;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UserLombak implements Serializable{
	 private  Long id; // will be set when persisting
	 
	 	@Getter
	    private String firstName;
	    private String lastName;
	    private int age;
	 
	    public UserLombak(String firstName, String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }
	    
	    
	   
}

package com.journaldev.builder;

import java.sql.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//pom.xml dependency
//mvn clean install
//mvn install
@Getter
@Setter
@NoArgsConstructor
public class EmployeeWithLombok {
 private String empId;
 private String firstName;
 private String lastname;
 private Date dob;
 private String phoneNo;
}
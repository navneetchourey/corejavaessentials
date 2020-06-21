package com.journaldev.lambda;

import java.util.ArrayList;
import java.util.List;

//It pass a block of code into a method that accepts a functional interface parameter
/*
 * method interface using an expression.
 *  very useful in collection library.
 *  It helps to iterate, filter and extract data from collection.
 *  @FunctionalInterface
 *  Less coding.
 *  Argument-list: It can be empty or non-empty as well.
 *  Arrow-token: It is used to link arguments-list and body of expression.
 *  Body: It contains expressions and statements for lambda expression.  e.g.   (p1,p2) -> { }  
 */
/*The CheckPerson interface is a functional interface. 
A functional interface is any interface that contains only one abstract method. 
(A functional interface may contain one or more default methods or static methods.) 
Because a functional interface contains only one abstract method, 
you can omit the name of that method when you implement it. 
*/
/*
A comma-separated list of formal parameters enclosed in parentheses.
instance of the class
The arrow token, ->
expression or statement block
return statement
curly braces - A return statement is not an expression; in a lambda expression, you must enclose statements in braces ({}).		
*/


//An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:
public class LambdaExpressionExample{  
public static void main(String[] args) { 

	Sayable ad1=(width,length)->(width+length);  
    System.out.println(ad1.say(10,20));  

	
    Sayable s=(width,length)->{  
    	return ad1.say(width, length);
//        return "I have nothing to say."+width +"  Length : "+length;  
    };  
    System.out.println(s.say(5,10));  
    
    List<String> list=new ArrayList<String>();  
    list.add("ankit");  
    list.add("mayank");  
    list.add("irfan");  
    list.add("jai");  
      
    list.forEach(  
        (n)->System.out.println(n)  
    );  
}  
}  
package com.journaldev.lambda;

public interface Payable {

	public abstract double raiseSalary(double percentage);
	//traditional way is to create a class implements this interface perform operation for this raiseSalary method
	// But we have t create a new class every time when we want to make a new salary implementation
	
	//Lambda expression allows us to pass in the functional interface method implementation, 
//	without having to create an entire class for it
	
	//syntax 
	//(method parameters) arrow token { return , method body} 
//	(double percentage) -> {return salary+(percentage * salary);}
//	(String a, String b, String c) => {return a+b+c;}
//	() => {return "Hello";}
//	we are just passing the body without implementing the method
//	The parameter type on the left side is optional
//	(percentage) -> {return salary + (percentage * salary);}
//	If there is only one parameter on the left side and the parameter type is ommited , the parenthesis are optional
//	percentage -> {return salary + (percentage * salary);}
//	On right side If there is only one statement in the body, the curly braces, return statement and semicolon are optional
//			All of these will be either exist together or ommited together
//	percentage ->salary + (percentage * salary);
//	cutCheck(percentage ->salary + (percentage * salary));

	

}

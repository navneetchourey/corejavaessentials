package com.abstractpkg;

public class American extends TestAbstract{

	private Double speed;
	private String route;
	
	public American(Double speed, String route) {
		this.speed=speed;
		this.route=route;
	}
	
	@Override
	public String run() {
		System.out.println("Running at "+this.speed );
		return "Running Performed";
	}
	
	@Override
	public String fly() {
		System.out.println("Aeroplane will fly at "+this.speed );
		return "Running Performed";
	}

	
	

	
	public String swim() {
		return route;
		// TODO Auto-generated method stub
		
	}

}

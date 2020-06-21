package com.abstractpkg;

public class Australia implements IMovable{

	private Double speed;
	private String route;
	
	public Australia(Double speed, String route) {
		this.speed=speed;
		this.route=route;
	}
	
	@Override
	public String run() {
		System.out.println("Running at "+this.speed );
		return "Running Performed";
	}

	@Override
	public String drive(Double speed, String route) {
		// TODO Auto-generated method stub
		return null;
	}

}

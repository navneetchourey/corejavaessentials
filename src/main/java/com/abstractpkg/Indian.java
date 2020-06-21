package com.abstractpkg;

public class Indian implements IMovable{
	private Double speed;
	private String route;
	
	
	public Indian(Double speed, String route) {
		super();
		this.speed = speed;
		this.route = route;
	}

	@Override
	public String run() {

		System.out.println("Indian athlete Running at "+this.speed);
		return null;
	}

	@Override
	public String drive(Double speed, String route) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

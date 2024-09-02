package com.xworks.datatypes.things;

public class Fan {
	
	String color="black";
	double cost=4000.00;
	int speed=1200;
	
	
	
	
	public void rotate() {
		System.out.println("running rotate in fan");
	}
	
	public void display() {
		
		System.out.println("color : "+color);
		System.out.println("cost : "+cost);
		System.out.println("speed : "+speed);
	}

}

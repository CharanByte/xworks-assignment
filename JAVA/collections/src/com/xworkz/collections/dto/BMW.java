package com.xworkz.collections.dto;

public class BMW {
	String color;
	
	public void setColor(String color) {
		
		if(color==null) {
			throw new Car();
		}
		else {
			System.out.println("color is valid");
		}
	}
	
	
	

}

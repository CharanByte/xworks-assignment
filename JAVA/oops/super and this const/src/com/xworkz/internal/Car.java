package com.xworkz.internal;

public class Car {
	
	private String company;
	private String color;
	private double cost;
	
	    
	public Car(String company, String color, double cost) {
		this(company,color);
		this.cost = cost;
	}


	public Car(String company, String color) {
		super();
		this.company = company;
		this.color = color;
	}
	
	public void print() {
		System.out.println("compand : "+company);
		System.out.println("color : "+color);
		System.out.println("price : "+cost);
	}
	
	
	
	

}

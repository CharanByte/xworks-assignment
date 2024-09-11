package com.xworkz.polyporhism.internal;

public class Bag {
	
	private String company;
	private String color;
	private double price;
	
	Bag(){
		
	}
	
	//constructor overloading
	public Bag(String company, String color, double price) {
		this(company,color);
		this.price = price;
	}

	public Bag(String company, String color) {
		super();
		this.company = company;
		this.color = color;
	}
	
	
	//method overloading
	
	public  void setter(String company, String color, double price) {
	
		this.company = company;
		this.color = color;
		this.price = price;
		
		System.out.println("company : "+company);
		System.out.println("color : "+color);
		System.out.println("price : "+price);
	}
	
	public void setter(String company, String color) {
		
		this.company = company;
		this.color = color;
		
		System.out.println("company : "+company);
		System.out.println("color : "+color);
		System.out.println("price : "+price);
	}
	
	

}

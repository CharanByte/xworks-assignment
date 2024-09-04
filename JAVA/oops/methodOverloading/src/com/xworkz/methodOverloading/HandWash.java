package com.xworkz.methodOverloading;

public class HandWash {
	
	private String company;
	private double price;
	private double quantity;
	
	//method overloading
	public HandWash(String company, double price, double quantity) {
		this(company,price);
		this.quantity = quantity;
	}


	public HandWash(String company, double price) {
		super();
		this.company = company;
		this.price = price;
	}


	public HandWash(double quantity) {
		super();
		this.quantity = quantity;
	}
	

	public void display() {
		System.out.println("company : "+company);
		System.out.println("price : "+price);
		System.out.println("quantity : "+quantity);
	}
	
	
	

}

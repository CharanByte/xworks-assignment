package com.xworkz.sidedish;

public class SideDish {
	String name;
	double price;
	String type;
	public SideDish(String name, double price, String type) {
		
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public void show() {
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("type : "+type);
	}
	

}

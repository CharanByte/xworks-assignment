package com.xworkz.data;

public class Sandal {
	
	 String brand;
	 char size;
	 double cost;
	 String color;
	 
	public Sandal(String brand, char size, double cost, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	
	public void show() {
		System.out.println("brand "+brand);
		System.out.println("size "+size);
		System.out.println("cost "+cost);
		System.out.println("color "+color);
	}
	 
	 

}

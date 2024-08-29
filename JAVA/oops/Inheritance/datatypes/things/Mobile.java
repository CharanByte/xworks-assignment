package com.xworks.datatypes.things;

public class Mobile {
	private String name;
	private double price;
	private String processor;
	
	
	public Mobile(String name, double price, String processor) {
		super();
		this.name = name;
		this.price = price;
		this.processor = processor;
	}
	
	public void call() {
		System.out.println("running call");
	}
	public void display() {
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("processor : "+processor);
		
	}
}

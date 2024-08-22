package com.xworks.market;

public class Market {
	
	String name;
	String location;
	public Market(String name, String location) {
		
		this.name = name;
		this.location = location;
	}
	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("location : "+location);
	}

}

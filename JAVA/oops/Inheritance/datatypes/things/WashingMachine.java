package com.xworks.datatypes.things;

public class WashingMachine {
	private String brand;
	private String type;
	private int capacity;
	
	public WashingMachine(String brand,String type,int capacity)
	{
		this.brand=brand;
		this.type=type;
		this.capacity=capacity;
	}
	public void rinse() {
		System.out.println("running rinse");
	}
	
	public void show() {
		System.out.println("brand :"+brand);
		System.out.println("type : "+type);
		System.out.println("capacity : "+capacity);
	}
	

}

package com.xworks.datatypes.things;

public class Camera {
	
	private String color;
	private double cost;
	private double weight;
	

	public Camera(String color,double cost) {
		super();
		this.color = color;
		this.cost=cost;
	}
	
	public Camera(String color ,double cost, Double weight) {
		this(color,cost);
		this.weight=weight;
	}


	public void capture() {
		System.out.println("running capture in camera");
	}
	
	public void display() {
		
		System.out.println("color : "+color);
		System.out.println("cost : "+cost);
		System.out.println("weight : "+weight);
	}
	

}

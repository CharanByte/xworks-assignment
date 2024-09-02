package com.xworks.datatypes.things;

public class SonyCamera extends Camera {
	
	public SonyCamera() {
		super("Black",40000.00);
		System.out.println("created Sonycamera const in SonyCamera");
	}
	
	public SonyCamera(String color ,double cost, Double weight) {
		super(color,cost,weight);
		System.out.println("created Sonycamera const in SonyCamera");
	}

}

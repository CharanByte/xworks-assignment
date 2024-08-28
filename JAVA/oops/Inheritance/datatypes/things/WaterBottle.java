package com.xworks.datatypes.things;

public class WaterBottle {
	public int quantity=1;
	public String color="white";
	
	public void fill() {
		System.out.println("running fill");
	}
	public void empty() {
		System.out.println("running empty");
	}
	public void crush() {
		System.out.println("running crush");
	}

}

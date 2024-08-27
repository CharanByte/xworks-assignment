package com.xworks.inheritance.type;

public class Bird {
	public String color;
	public double weight;
	public double height;
	public String breed;
	public String food;
	
	public Bird(){
		System.out.println("const in bird");
	}
	
	public void fly() {
		System.out.println("yes it can fly");
	}
	public void sound() {
		System.out.println("cluck");
	}
	public void food() {
		System.out.println("grains");
	}
	
	

	
}

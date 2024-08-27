package com.xworks.inheritance.type;

public class Animal {
	public String color;
	public double weight;
	public double height;
	public String breed;
	public String food;
	
	public Animal() {
		System.out.println("const.. in Animal");
	}
	
	public void printcolor() {
		System.out.println("color : "+color);
	}
	public void printweight() {
		System.out.println("height : "+height);
	}
	public void printheight() {
		System.out.println("weight : "+weight);
	}
	public void printbreed() {
		System.out.println("breed : "+breed);
	}public void printfood() {
		System.out.println("food : "+food);
	}
}

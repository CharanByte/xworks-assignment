package com.xworks.inheritance.type;

public class Sweet {

	public String color;
	public  double weight;
    
	
	public Sweet(){
		System.out.println("running  no arrugement in Sweet");

	}
	
	public void printColor() {
		System.out.println("color : "+color);
	}
	
   public void printWeight() {
		System.out.println("weight : "+weight);
	}
}

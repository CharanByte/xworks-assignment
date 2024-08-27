package com.xworks.inheritance.type;

public class Phone {
	public String color;
	public double price;
	public int storage;
	public String processor;
	public String name;
	
	public Phone() {
		System.out.println("running const in phone");
	}
	
	public void printColor() {
		System.out.println("color : "+color);
	}
	public void printPrice() {
		System.out.println("price : "+price);
	}
	public void printStorage() {
		System.out.println("storage : "+storage);
	}
	public void printProcessor() {
		System.out.println("name : "+processor);
	}
	public void printName() {
		System.out.println("name : "+name);
	}

}

package com.xworks.datatypes.things;

public class Soap {
	public String brand;
	public double cost;
	
	public Soap() {
		
	}
	
	public Soap( String brand,double cost) {
		System.out.println("created no arr const");
		this.brand=brand;
		this.cost=cost;
	}
	
	public void bath() {
		System.out.println("running bath");
	}
	
}

package com.xworks.datatypes.things;

public class Shoe {
	
	public String brand;
	public double cost;
	
	public Shoe()
	{
	 System.out.println("created no arr const");
	}
	
	public Shoe(String brand,double cost) {
		this.brand=brand;
		this.cost=cost;
	}
	
	public void safeGuard() {
		System.out.println("running safeGuard");
	}
	
	public void enhanceWalk() {
		System.out.println("running enhanceWalk ");
	}

}

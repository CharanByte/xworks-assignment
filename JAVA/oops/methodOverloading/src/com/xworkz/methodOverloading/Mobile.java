package com.xworkz.methodOverloading;

public class Mobile {
	
	private String brand;
	private double cost;
	private int refreshRate;
	
	public void setter(String brand ,double cost,int refreshRate) {
		this.brand=brand;
		this.cost=cost;
		this.refreshRate=refreshRate;
		getter();
	}
	
	public void setter(String brand ,double cost) {
		this.brand=brand;
		this.cost=cost;
		getter();
	}
	public void setter(Double cost,String brand) {
		this.cost=cost;
		this.brand=brand;
		getter();
	}
	
	public void getter() {
		System.out.println("brand : "+brand);
		System.out.println("cost : "+cost);
		System.out.println("refreshRate : "+refreshRate);
	}
	
	
	

}

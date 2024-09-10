package com.xworkz.casting.internal;

public class Grinder {
	
	private double price;
	private double powerConsumption;
	private int warranty;
	private String seller;
	private String material;
	private double rating;
	public Grinder(double price, double powerConsumption, int warranty, String seller, String material, double rating) {
		super();
		this.price = price;
		this.powerConsumption = powerConsumption;
		this.warranty = warranty;
		this.seller = seller;
		this.material = material;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Grinder [price=" + price + ", powerConsumption=" + powerConsumption + ", warranty=" + warranty + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof Grinder) {
				Grinder casted =(Grinder)obj;
				if(this.price==casted.price && this.powerConsumption==casted.powerConsumption && this.material.equals(casted.material)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
	



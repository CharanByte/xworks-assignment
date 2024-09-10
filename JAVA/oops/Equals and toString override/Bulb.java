package com.xworkz.casting.internal;

public class Bulb {
	
	private double price;
	private double powerConsumption;
	private int voltage;
	private String seller;
	private String material;
	private double rating;
	public Bulb(double price, double powerConsumption, int voltage, String seller, String material, double rating) {
		super();
		this.price = price;
		this.powerConsumption = powerConsumption;
		this.voltage = voltage;
		this.seller = seller;
		this.material = material;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Grinder [price=" + price + ", powerConsumption=" + powerConsumption + ", warranty=" + voltage + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof Bulb) {
				Bulb casted =(Bulb)obj;
				if(this.price==casted.price && this.voltage==casted.voltage && this.material.equals(casted.material)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
	





package com.xworkz.casting.internal;

public class Kettle {
	
	private double price;
	private double capacity;
	private int warranty;
	private String seller;
	private String material;
	private double rating;
	
	public Kettle(double price, double capacity, int warranty, String seller, String material, double rating) {
		super();
		this.price = price;
		this.capacity = capacity;
		this.warranty = warranty;
		this.seller = seller;
		this.material = material;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Kettle [price=" + price + ", capacity=" + capacity + ", warranty=" + warranty + ", seller=" + seller
				+ ", Material=" + material + ", rating=" + rating + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj!=null) {
			if(obj instanceof Kettle) {
				Kettle casted=(Kettle)obj;
				if(this.price==casted.price && this.material.equals(casted.material) && this.capacity==casted.capacity) {
					return true;
				}
				}
		}
		return false;
	}
	
	
	
	

}

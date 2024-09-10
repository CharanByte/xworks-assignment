package com.xworkz.casting.internal;

public class Bedsheet {
	private String color;
	private double price;
	private String material;
	private String seller;
	private double rating;
	private boolean returnPolicy;
	public  Bedsheet(String color, double price, String material, String seller, double rating, boolean returnPolicy) {
		super();
		this.color = color;
		this.price = price;
		this.material = material;
		this.seller = seller;
		this.rating = rating;
		this.returnPolicy = returnPolicy;
	}
	@Override
	public String toString() {
		return "Saree [color=" + color + ", price=" + price + ", material=" + material + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof Bedsheet) {
				Bedsheet casted =(Bedsheet)obj;
				if(this.color.equals(casted.color) && this.price==casted.price && this.rating==casted.rating) {
					return true;
				}
			}
		}
		
		return false;
	}

}




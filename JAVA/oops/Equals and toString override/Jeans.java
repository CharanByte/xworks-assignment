package com.xworkz.casting.internal;

public class Jeans {
	
	private String color;
	private double price;
	private char size;
	private String seller;
	private int rating;
	private boolean fit;
	
	public Jeans(String color, double price, char size, String seller) {
		super();
		this.color = color;
		this.price = price;
		this.size = size;
		this.seller = seller;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setFit(boolean fit) {
		this.fit = fit;
	}
	
	@Override
	public String toString() {
		
		return "color "+color+" price "+price;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof Jeans) {
				Jeans casted=(Jeans)obj;
				
				if(this.color.equals(casted.color) && this.price==casted.price && this.rating==casted.rating) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	

}

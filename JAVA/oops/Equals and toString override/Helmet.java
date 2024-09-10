package com.xworkz.casting.internal;

public class Helmet {
	
	private String color;
	private double cost;
	private String brand;
	private  String type;
	private String size;
	private  double weight;
	public Helmet(String color, double cost, String brand, String type,String size, double weight) {
		super();
		this.color = color;
		this.cost = cost;
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Helmet [color=" + color + ", cost=" + cost + ", brand=" + brand + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Helmet) {
				Helmet casted =(Helmet)obj;
				if(this.size==casted.size && this.color.equals(casted.color)&& this.weight==casted.weight) {
					return true;
				}
			}
		}
		return false;
	}

}

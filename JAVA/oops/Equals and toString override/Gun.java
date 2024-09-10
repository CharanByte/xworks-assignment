package com.xworkz.casting.internal;

public class Gun {
	
	private String model;
    private String manufacturer;
    private double caliber;
    private int capacity;
    private double weight;
    private String type;
	public Gun(String model, String manufacturer, double caliber, int capacity, double weight, String type) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.caliber = caliber;
		this.capacity = capacity;
		this.weight = weight;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Gun [model=" + model + ", manufacturer=" + manufacturer + ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Gun) {
				Gun casted =(Gun)obj;
				if(this.model.equals(casted.model) && this.capacity==casted.capacity && this.weight==casted.weight) {
					return true;
				}
			}
		}
		
		return false;
	}
}

package com.xworks.assignment;

public class Plant {
	String name;
	double height;
	String locatedAt;
	double volume;
	int noOfFruits;
	int  onOfFlowers;
	String fruitColor;
	String plantedBy;
	boolean photosynthetic;
	
	Plant(String name,double height,String locatedAt,double volume,int noOfFruits){
		this.name=name;
		this.height=height;
		this.locatedAt=locatedAt;
		this.volume=volume;
		this.noOfFruits=noOfFruits;
	}
	
	public void setter(int  onOfFlowers,String fruitColor,String plantedBy,boolean photosynthetic) {
		this.onOfFlowers=onOfFlowers;
		this.fruitColor=fruitColor;
		this.plantedBy=plantedBy;
		this.photosynthetic=photosynthetic;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(locatedAt);
		System.out.println(volume);
		System.out.println(noOfFruits);
		System.out.println(onOfFlowers);
		System.out.println(fruitColor);
		System.out.println(plantedBy);
		System.out.println(photosynthetic);
		

	}
	
}

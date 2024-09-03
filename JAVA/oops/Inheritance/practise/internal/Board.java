package com.xworkz.practise.internal;

public class Board {
	
	private String color;
	private double height;
	
	protected Board() {
		System.out.println("created no arrgu const Board ");
	}
	
	public Board(String color,double height) {
		this.color=color;
		this.height=height;
		System.out.println("created two arrgu const Board ");
	}
	
	public void display() {
		System.out.println("color : "+color);
		System.out.println("height  : "+height);
		
	}

}

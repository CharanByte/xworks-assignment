package com.xworkz.bike.store;

public class BikeRunner {
	
	public static void main(String[] args) {
		Bike bike =new Bike();
		bike.store("honda");
		bike.store("tvs");
		bike.store("shine");
		bike.store("cd100");
		bike.store("pulsar");
		bike.store("bullet");
		bike.store("ns200");

		bike.show();
//	
	}

}

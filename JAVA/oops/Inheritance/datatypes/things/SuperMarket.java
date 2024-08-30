package com.xworks.datatypes.things;

public class SuperMarket extends Market {
	
	public SuperMarket(String name, String location, int shops, String type) {
		super(name,location,shops,type);
		System.out.println("created SuperMarket const with 4 arrgu ");
	}

	public SuperMarket(String name, int shops) {
		super(name,shops);
		System.out.println("created SuperMarket const with 2 arrgu ");
	}

	
	
}

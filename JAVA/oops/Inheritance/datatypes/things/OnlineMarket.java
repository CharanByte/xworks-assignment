package com.xworks.datatypes.things;

public class OnlineMarket extends Market {
	
	public OnlineMarket(String name, String location, int shops, String type) {
		super(name,location,shops,type);
		System.out.println("created SuperMarket const with 4 arrgu ");
	}

	public OnlineMarket(String name, int shops) {
		super(name,shops);
		System.out.println("created SuperMarket const with 2 arrgu ");

}
}

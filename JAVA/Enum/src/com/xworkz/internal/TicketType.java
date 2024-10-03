package com.xworkz.internal;

public enum TicketType {
	ONLINE(200), OFFLINE(400);

	private int price;

	private TicketType(int i) {
		this.price = i;
	}
	
	public int getPrice() {
		return this.price;
	}

}

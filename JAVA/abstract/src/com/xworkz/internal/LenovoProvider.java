package com.xworkz.internal;

public class LenovoProvider extends Provider {
	
	private double profit;

	public LenovoProvider(String name, String ceoName, double profit) {
		super(name, ceoName);
		this.profit = profit;
		System.out.println("created three arg const in LenovoProvider");

	}
	
	@Override
	public void service() {
		System.out.println("running service in LenovoProvider");
	}
	

}

package com.xworkz.internal;

public class DellProvider extends Provider {
	
	public DellProvider(String name,String ceo) {
		super(name,ceo);
		System.out.println("created two arg const in DellProvider");
	}
	@Override
	public void service() {
		System.out.println("running service in DellProvider");
	}

}

package com.xworkz.internal;

public abstract class InternetProvider extends Provider {
	
	public InternetProvider(String name,String ceo) {
		super(name,ceo);
		System.out.println("created two arg const in InternetProvider");
	}
	
	

}

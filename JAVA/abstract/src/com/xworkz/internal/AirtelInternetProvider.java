package com.xworkz.internal;

public abstract class AirtelInternetProvider extends InternetProvider {
	
	public AirtelInternetProvider(String name,String ceo) {
		super(name,ceo);
		System.out.println("created two arg const in AirtelInternetProvider");

	}

}

package com.xworkz.internal;

public abstract class BookingProvider extends Provider {
	
	BookingProvider(String name, String ceoName){
		super(name,ceoName);
		System.out.println("created two arg const in BookingProvider");

	}
	

	
}

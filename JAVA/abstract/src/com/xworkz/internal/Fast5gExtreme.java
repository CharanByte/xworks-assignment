package com.xworkz.internal;

public class Fast5gExtreme extends ExtremeAirtelInternetProvider {
	
	public Fast5gExtreme(String name,String ceo) {
		super(name,ceo);
		System.out.println("created two arg const in Fast5gExtreme");

	}
	
	@Override
	public void service() {
		System.out.println("running service in Fast5gExtreme");
	}

}

package com.xworkz.internals;

public class BmwBike extends Bike {
	
	@override    //can not modify the method which is declared as final
	public void buy() {
		System.out.println("running buy in BmwBike");
	}

}

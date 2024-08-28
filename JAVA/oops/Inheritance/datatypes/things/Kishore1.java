package com.xworks.datatypes.things;

public class Kishore1 {

	public void sells(Soap soap) {
		
		if(soap!=null) {
		soap.bath();
		System.out.println(soap.brand);
		System.out.println(soap.cost);
		}
		else {
			System.out.println("this is null");
		}
	}

}

package com.xworks.datatypes;

import com.xworks.datatypes.things.*;

public class SoapRunner {

	
	public static void main(String[] args) {
		
		Nandan nan=new Nandan();
		nan.buy();
		
		System.out.println("*****************************");
		
		Kishore1 kish=new Kishore1();
		Soap soap=new Soap();
		soap.brand="lux";
		soap.cost=45;
		kish.sells(soap);
			
		
		
	}
}

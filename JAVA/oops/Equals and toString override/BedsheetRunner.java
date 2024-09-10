package com.xworkz.casting.internal;

public class BedsheetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bedsheet bedsheet1=new Bedsheet("red", 3000, "fabric", "FASHION", 3.9, true);
		
		Bedsheet bedsheet2=new Bedsheet("red", 3000, "cotton", "FASHION", 3.9, true);
		
		boolean result=bedsheet1.equals(bedsheet2);
		System.out.println(result);
	}

}

package com.xworkz.casting.internal;

public class HelmetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helmet helmet1=new Helmet("black", 5000, "Steelbird", "Flip-up", "XL", 1200);
		
		Helmet helmet2=new Helmet("gray", 6000, "Steelbird", "Flip-up", "L", 1100);

		
		boolean result=helmet1.equals(helmet2);
		System.out.println(result);

	}

}

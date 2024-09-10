package com.xworkz.casting.internal;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country country1=new Country("India", "New Delhi", 126300000, 377975, 28, "INR");
				
		Country country2=new Country("Japan", "Tokyo", 126300000, 377975, 25, "Yen");
		
		boolean result=country1.equals(country2);
		System.out.println(result);


	}

}

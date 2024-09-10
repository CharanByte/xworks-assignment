package com.xworkz.casting.internal;

public class JeansRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jeans jeans1=new Jeans("blue", 900, 'L', "ZARA");
		jeans1.setFit(true);
		jeans1.setRating(4);
		
		System.out.println(jeans1);
		
		Jeans jeans2=new Jeans("blue", 900, 'L', "ZARA");
		jeans1.setFit(true);
		jeans1.setRating(4);
		
		boolean result=jeans1.equals(jeans2);
		
		System.out.println(result);

	}

}

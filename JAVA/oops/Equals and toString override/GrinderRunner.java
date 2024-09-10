package com.xworkz.casting.internal;

public class GrinderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grinder grinder1=new Grinder(2000, 500, 2,  "KLPLWORLDRetail", "ABS Body", 4);
	
		Grinder grinder2=new Grinder(2000, 500, 2,  "KLPLWORLDRetail", "ABS Body", 4);
		boolean result=grinder1.equals(grinder2);
		System.out.println(result);


	}

}

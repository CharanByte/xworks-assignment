package com.xworkz.casting.internal;

public class KettleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kettle kettle1=new Kettle(1500, 1.5, 1, "Hamilton Housewares", "Stainless Steel", 3.5);
		System.out.println(kettle1);
		
		Kettle kettle2=new Kettle(1000, 1, 1, "hamilton Housewares", "Stainless Steel", 3.5);

		boolean result=kettle2.equals(kettle1);
		System.out.println(result);
		

	}

}

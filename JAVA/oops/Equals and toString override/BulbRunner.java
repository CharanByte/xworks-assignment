package com.xworkz.casting.internal;

public class BulbRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb bulb1=new Bulb(200, 30, 240,  "KLPLWORLDRetail", "Polycarbonate", 4);
		
		Bulb bulb2=new Bulb(250, 30, 240, "ValenciaSales", "Polycarbonate", 4.3);
		boolean result=bulb2.equals(bulb1);
		System.out.println(result);


	}
	

}

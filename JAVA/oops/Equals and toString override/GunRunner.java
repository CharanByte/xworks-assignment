package com.xworkz.casting.internal;

public class GunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun gun1 =new Gun("Glock 19", "Glock", 9.0, 15, 0.7, "Handgun");
		
		Gun gun2 =new Gun("Glock 19", "Glock", 8.0, 15, 0.7, "shortgun");

		
		boolean result=gun2.equals(gun1);
		System.out.println(result);

	}

}

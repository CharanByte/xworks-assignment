package com.xworkz.runner;

import com.xworkz.methodOverloading.HandWash;

public class HandWashRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandWash handWash =new HandWash("Lifeboy",100,350);
		handWash.display();
		
		System.out.println("**********************");
		
		HandWash handWash1 =new HandWash("savlon",100);
		handWash1.display();
		
		System.out.println("**********************");
		
		HandWash handWash2 =new HandWash(100);
		handWash2.display();

	}

}

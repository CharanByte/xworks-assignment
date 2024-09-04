package com.xworkz.runner;

import com.xworkz.methodOverloading.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile=new Mobile();
		mobile.setter("Mi", 20000, 120);
		
		System.out.println("*************************");
		
		mobile.setter("vivo", 22000);
		
		System.out.println("*************************");
		
		mobile.setter(30000.00, "nothing");


		
		

	}

}

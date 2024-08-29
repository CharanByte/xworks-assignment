package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class Mobilerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ajay ajay=new Ajay();
		ajay.use();
		
		System.out.println("****************************");
		Darshan darshan=new Darshan();
		darshan.sell(new Mobile("Samsung", 30000, "Samsung Exynos 2400"));
		
		System.out.println("****************************");

		Rocky rocky=new Rocky();
		rocky.setter(new Mobile("realme",25000,"MediaTek Dimensity 9300"));
		rocky.buy();
		
		System.out.println("****************************");
		
		System.out.println("****************************");
		
		Vijay vijay=new Vijay();
		vijay.sell();
	}

}

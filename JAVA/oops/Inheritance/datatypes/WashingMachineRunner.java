package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class WashingMachineRunner {
	
	public static void main(String[] args) {
		
		Megha megha=new Megha();
		megha.uses();
		
		System.out.println("****************************");
		
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.use(new WashingMachine("Samsung", "topload", 30));
		
		System.out.println("****************************");
		
		Abhishek abhishek=new Abhishek();
		abhishek.buy(new WashingMachine("Whirlpool", "frontload", 35));
		abhishek.print();
		System.out.println("****************************");

		Bhukima bhukima=new Bhukima();
		bhukima.sell(new WashingMachine("Bosch",  "topload", 40));
		
		System.out.println("****************************");

		Nayana nayana=new Nayana();
		nayana.uses();
		}

}

package com.xworkz.sweet.store;

public class Sweet {
	
	String[] sweet =new String[7];
	int count=0;
	
	public void store(String name) {
		sweet[count++]=name;
	}
	
	public void display() {
		for(String sweetName:sweet) {
			System.out.println(sweetName);
		}
	}

}

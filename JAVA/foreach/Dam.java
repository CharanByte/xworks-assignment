package com.xworkz.dam.store;

public class Dam {
	String[] name=new String[7];
	int count;
	
	public void store(String name) {
		this.name[count++]=name;
	}
	
	public void display() {
		for(String damName : name) {
			System.out.println(damName);
		}
	}
}

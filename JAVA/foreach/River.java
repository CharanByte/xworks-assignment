package com.xworkz.river.store;

public class River {
	String[] name=new String[7];
	int count;
	
 public void store(String name) {
	 this.name[count++]=name;
	 
 }
 public void display() {
	 for(String river : name) {
		 System.out.println(river);
	 }
 }

}

package com.xworkz.polyporhism.internal;

public class BagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag bag=new Bag();
		Bag bag1 =new Bag("Player","red",600);
		
		Bag bag2=new Bag("puma","blue");

		bag.setter("nike","orange");
		System.out.println("---------------------------------");
		bag.setter("reebok","black",2000);
		

	}

}

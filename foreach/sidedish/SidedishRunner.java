package com.xworkz.sidedish;

public class SidedishRunner {

	public static void main(String[] args) {
		
		SideDish sidedish=new SideDish("chips",10,"potato");
		
		SideDishStore sidedishstore=new SideDishStore();
		sidedishstore.store(sidedish);
		
		sidedishstore.display();

	}

}

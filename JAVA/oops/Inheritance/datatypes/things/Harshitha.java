package com.xworks.datatypes.things;

public class Harshitha {
	
	public Shoe shoe;
	
	public void buy() {
		
		if(shoe!=null) {
		shoe.enhanceWalk();
		shoe.safeGuard();
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
		}
		else {
			System.out.println("this is null");

		}
	}

}

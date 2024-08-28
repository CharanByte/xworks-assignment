package com.xworks.datatypes.things;

public class Omkar {
	
	public void brought(Shoe shoe)
	{
		if(shoe!=null) {
		shoe.safeGuard();
		shoe.enhanceWalk();
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
		}
		else {
			System.out.println("this is null");
		}
	}
}

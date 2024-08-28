package com.xworks.datatypes.things;

public class Shwetha {
	
	
	public void brought(WaterBottle water) {
		water.fill();
		water.empty();
		water.crush();
		System.out.println(water.quantity);
		System.out.println(water.color);
		
	}

}

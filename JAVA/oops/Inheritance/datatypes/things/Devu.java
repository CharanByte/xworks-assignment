package com.xworks.datatypes.things;

public class Devu {

	
	WaterBottle bottle;
	
	public Devu(WaterBottle bottle) {
		this.bottle=bottle;
		
	}
	
	public void sell() {
		System.out.println(bottle.color);
		System.out.println(bottle.quantity);
		bottle.fill();
		bottle.crush();
		bottle.empty();
	}
}

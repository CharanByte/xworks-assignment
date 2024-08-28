package com.xworks.datatypes.things;

public class Gunashree {
	
	public void buy() {
		WaterBottle bottle=new WaterBottle();
		bottle.fill();
		bottle.empty();
		bottle.crush();
		System.out.println(bottle.quantity);
		System.out.println(bottle.color);

	}

}

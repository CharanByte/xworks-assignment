package com.xworks.datatypes;

import com.xworks.datatypes.things.*;

public class WaterBottleRunner {
	public static void main(String[] args)
	{
	Gunashree gunashree=new Gunashree();
	gunashree.buy();
	
	Shwetha shwetha=new Shwetha();
	WaterBottle bottle=new WaterBottle();
	shwetha.brought(bottle);
	
	WaterBottle bottle1=new WaterBottle();
	bottle1.color="black";
	bottle1.quantity=3;
	Devu dev =new Devu(bottle1);
	dev.sell();
	
	}
	

}

package com.xworks.datatypes;

import com.xworks.datatypes.things.*;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Divya divya=new Divya();
		divya.ware();
		
		
		Omkar omkar =new Omkar();
		Shoe shoe1=new Shoe();
		shoe1.brand="paragon";
		shoe1.cost=200;
		omkar.brought(shoe1);
		
		Harshitha har=new Harshitha();
		Shoe shoe2=new Shoe();
		shoe2.brand="vkc";
		har.shoe=shoe2;
		har.buy();

	}

}

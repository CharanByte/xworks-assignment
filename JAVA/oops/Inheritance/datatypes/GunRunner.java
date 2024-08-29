package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class GunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier soldier=new Soldier();
		soldier.use();
		
		System.out.println("*******************************");
		
		Police police =new Police();
		police.fire(new Gun("AWM","India","LongRange"));
		System.out.println("*******************************");

		Dboss dboss=new Dboss(new Gun("AK47","India","MidRange"));
		dboss.print();
		System.out.println("*******************************");
		
		Godse godse=new Godse();
		Gun store=godse.fire(new Gun("KAR98","India","LongRange"));
//		System.out.println(store);
		
		
	}

}

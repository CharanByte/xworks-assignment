package com.xworkz.fuctionalinterfaces.runner;

import com.xworkz.fuctionalinterfaces.FoodApp;
import com.xworkz.fuctionalinterfaces.Starter;
import com.xworkz.fuctionalinterfaces.use.Labour;

public class StarterRunner {

	public static void main(String[] args) {

		Starter starter=()->{
			System.out.println("running lambda exp");
		};
		Labour labour=new Labour(starter);
		
		FoodApp app=(String s)->{
			System.out.println("item : " +s);
		};
		labour.orderFood(app);
		
		
	}

}

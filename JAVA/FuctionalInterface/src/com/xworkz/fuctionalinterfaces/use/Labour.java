package com.xworkz.fuctionalinterfaces.use;

import com.xworkz.fuctionalinterfaces.FoodApp;
import com.xworkz.fuctionalinterfaces.Starter;

public class Labour {
	
	public Labour(Starter s) {
		
		if(s!=null) {
			s.on();
		}
		else {
			System.out.println("null");
		}
	
		
	}
	public void orderFood(FoodApp app) {
		app.order("idli");
	}

}

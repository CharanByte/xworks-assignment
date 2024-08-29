package com.xworks.datatypes.things;

public class Godse {
	
	public Gun fire(Gun gun) {
		
		if(gun!=null) {
			gun.fire();
			gun.display();

		}
		else {
			System.out.println("this is null");
		}
		return gun;
		
	}

}

package com.xworks.datatypes.things;

public class Police {
	
	public void fire(Gun gun) {
	if(gun!=null) {
		gun.display();
		gun.fire();
	}
	else
		System.out.println("this is null");
}

}

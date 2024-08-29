package com.xworks.datatypes.things;

public class Darshan {
	
	public void sell(Mobile mobile) {
		if(mobile!=null) {
		mobile.call();
		mobile.display();
		}
		else
			System.out.println("this is null");
	}

}

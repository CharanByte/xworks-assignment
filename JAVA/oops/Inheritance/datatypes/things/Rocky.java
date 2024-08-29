package com.xworks.datatypes.things;

public class Rocky {
	Mobile mobile;
	
	public void setter(Mobile mobile) {
		this.mobile=mobile;
	}
	public void buy() {
		if(mobile!=null) {
		mobile.call();
		mobile.display();
		}
		else 
			System.out.println("this is null");
	}

}

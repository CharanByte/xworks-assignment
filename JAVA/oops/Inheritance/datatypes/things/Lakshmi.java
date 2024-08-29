package com.xworks.datatypes.things;

public class Lakshmi {
	
	public void use(WashingMachine washingMachine) {
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}
		else
			System.out.println("this is null");
	}

}

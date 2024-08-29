package com.xworks.datatypes.things;

public class Bhukima {
	
	public WashingMachine sell(WashingMachine washingMachine) {
		
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}
		
		return washingMachine;
		
	}

}

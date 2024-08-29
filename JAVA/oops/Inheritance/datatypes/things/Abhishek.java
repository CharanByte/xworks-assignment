package com.xworks.datatypes.things;

public class Abhishek {
	WashingMachine washingMachine;
	
	public void buy(WashingMachine washingMachine) {
		this.washingMachine=washingMachine;
	}
	
	public void print() {
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}
		else
			System.out.println("this is null");
	}
}

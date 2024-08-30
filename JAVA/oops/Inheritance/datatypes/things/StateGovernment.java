package com.xworks.datatypes.things;

public class StateGovernment extends Government {
	
	public StateGovernment(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
		super(state,noOfMlas,partyHeadName,homeMinsterName);
		System.out.println("created StateGovernment cont with 4 arrgu ");
	}

	public StateGovernment(String state, int noOfMlas) {
		super(state,noOfMlas);
		System.out.println("created StateGovernment cont with 2 arrgu ");
	}

}

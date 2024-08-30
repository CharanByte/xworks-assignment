package com.xworks.datatypes.things;

public class CentrlGovernmnet extends Government {
	
	public CentrlGovernmnet(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
		super(state,noOfMlas,partyHeadName,homeMinsterName);
		System.out.println("created CentrlGovernmnet cont with 4 arrgu ");
	}

	public CentrlGovernmnet(String state, int noOfMlas) {
		super(state,noOfMlas);
		System.out.println("created CentrlGovernmnet cont with 2 arrgu ");
	}

}

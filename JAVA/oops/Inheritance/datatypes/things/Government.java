package com.xworks.datatypes.things;

public class Government {
	private String state;
	private int  noOfMlas;
	private String partyHeadName;
	private String homeMinsterName;
	
	public Government(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
		this.homeMinsterName = homeMinsterName;
	}
	
	public Government(String state, int noOfMlas) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
		
	}
	
	public void display() {
		System.out.println("state : "+state);
		System.out.println("noOfMlas : "+noOfMlas);
		System.out.println("partyHeadName : "+partyHeadName);
		System.out.println("homeMinsterName : "+homeMinsterName);
	}
	
	
	
	
}

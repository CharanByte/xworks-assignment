package com.xworkz.internal;

public class Hospital implements HospitalRule {

	@Override
	public boolean silence() {
		// TODO Auto-generated method stub
		System.out.println("running silence in Hospital");
		return true;
	}

	@Override
	public boolean mask() {
		// TODO Auto-generated method stub
		System.out.println("running mask in Hospital");
		return true;
	}

	@Override
	public boolean noSmoking() {
		// TODO Auto-generated method stub
		System.out.println("running noSmoking in Hospital");
		return true;
	}
	
	

}

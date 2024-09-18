package com.xworkz.internal;

public class PgOwner implements PGRule {

	@Override
	public double costPerMonth(double price) {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public boolean wifi(char ref) {
		// TODO Auto-generated method stub
		if(ref=='y')
			return true;
		else
			return false;
	}

}

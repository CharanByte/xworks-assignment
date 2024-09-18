package com.xworkz.internal;

public class Sachin implements MallRule {

	@Override
	public boolean validId(int id) {
		if (id != 0)
			return true;
		else
			return false;

	}

}

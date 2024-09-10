package com.xworkz.casting.internal;

public class StateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state1=new State("karnataka","bengaluru",7, 191791, 31, "INR");
		
		State state2=new State("Telangana","Hyderabad",4, 151621, 33, "INR");

		
		boolean result=state1.equals(state2);
		System.out.println(result);


	}

}

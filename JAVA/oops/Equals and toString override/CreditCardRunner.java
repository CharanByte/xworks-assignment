package com.xworkz.casting.internal;

public class CreditCardRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card1=new CreditCard(7645637673873L, "raj", 2030, 50000, 20000, 454);

		CreditCard card2=new CreditCard(8637673565873L, "chotu", 2027, 50000, 20000, 454);

		boolean result=card1.equals(card2);
		System.out.println(result);

	}

}

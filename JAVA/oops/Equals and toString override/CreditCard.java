package com.xworkz.casting.internal;

public class CreditCard {

	private long cardNumber;
	private String cardHolderName;
	private double expiryDate;
	private double creditLimit;
	private double balance;
	private int cvv;
	public CreditCard(long cardNumber, String cardHolderName, double expiryDate, double creditLimit, double balance,
			int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.creditLimit = creditLimit;
		this.balance = balance;
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", cvv=" + cvv + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof CreditCard) {
				CreditCard casted =(CreditCard)obj;
				if(this.creditLimit==casted.creditLimit && this.balance==casted.balance && this.cvv==casted.cvv) {
					return true;
				}
			}
		}
		return false;
	}
	}

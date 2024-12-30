package com.xworkz.exception.service;

import com.xworkz.exception.CustomerException;

public class Customer {
	
	public void price(int price) throws CustomerException {
		
		if(price<5) {
			
			throw new CustomerException();
		}
	}

}

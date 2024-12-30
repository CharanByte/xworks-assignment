package com.xworkz.exception.runner;

import com.xworkz.exception.CustomerException;
import com.xworkz.exception.service.Customer;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		try {
			customer.price(3);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.xworkz.exception.runner;

import com.xworkz.exception.*;
import com.xworkz.exception.service.Service;

public class ServiceRunner {

	public static void main(String[] args) throws InvalidEmail {
		// TODO Auto-generated method stub
		
		Service servive=new Service();
		
		servive.saveEmail("charan@gmail.com");
		
		System.out.println("=============");
		
		
		servive.acceptPrice(99);

	}

}

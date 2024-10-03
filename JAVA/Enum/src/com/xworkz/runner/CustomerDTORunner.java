package com.xworkz.runner;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.internal.ProductType;

public class CustomerDTORunner {

	public static void main(String[] args) {

		CustomerDTO customerDTO=new CustomerDTO("Raj", "raj@gmail.com", ProductType.FOOTWEAR);
		String name=customerDTO.getName();
		String email= customerDTO.getEmail();
		ProductType type= customerDTO.getProdoctType();
		
		System.out.println("name : "+name+" email : "+email+" ProductType : "+type);
		
	}

}

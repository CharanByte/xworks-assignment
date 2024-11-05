package com.xworkz.collections.dto.runner;

import com.xworkz.collections.dto.AddressDTO;
import com.xworkz.collections.dto.Country1DTO;

public class AddressDTORunner {

	public static void main(String[] args) {
		AddressDTO dto=new AddressDTO(101, "mg road", "kolar", "karnataka", new Country1DTO("India", 91));

	}

}

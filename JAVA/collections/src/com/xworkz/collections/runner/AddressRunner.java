package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.collections.dto.AddressDTO;
import com.xworkz.collections.dto.Country1DTO;

public class AddressRunner {

	public static void main(String[] args) {
		
		Map<String,AddressDTO> map=new HashMap<>();
		map.put("charan", new AddressDTO(101, "Tamaka", "kolar", "karnataka", new Country1DTO("India", 91)));
		map.put("nandan",  new AddressDTO(101, "GANDHI NAGARA", "kolar", "karnataka", new Country1DTO("India", 91)));
		map.put("kishor",  new AddressDTO(101, "BHRAMIN STREET", "Srinivaspur", "karnataka", new Country1DTO("India", 91)));
		map.put("likith",  new AddressDTO(101, "KOTE", "KGF", "karnataka", new Country1DTO("India", 91)));
		map.put("chandan",  new AddressDTO(101, "MAHALAKSHMI LAYOUT", "Bangarpet", "karnataka", new Country1DTO("India", 91)));
		
		Set<String> key=map.keySet();
		key.forEach(keys->System.out.println(keys));
		
		System.out.println("===============================");
		
		Collection<AddressDTO> values=map.values();
		values.forEach(value->System.out.println(value));
		
		System.out.println("===============================");
		
		Set<Map.Entry<String, AddressDTO>> entry=map.entrySet();
		entry.forEach(entries->System.out.println(entries.getKey()+" : "+entries.getValue()));
		
	}

}

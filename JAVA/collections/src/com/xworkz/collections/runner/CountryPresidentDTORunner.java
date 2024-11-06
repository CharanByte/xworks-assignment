package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.collections.dto.AddressDTO;
import com.xworkz.collections.dto.Country1DTO;
import com.xworkz.collections.dto.PresidentDTO;

public class CountryPresidentDTORunner {

	public static void main(String[] args) {
	Map<Country1DTO,PresidentDTO> map=new HashMap<>();
	map.put(new Country1DTO("india",91), new PresidentDTO("Droupadi Murmu", "preserve the constitution ", 78,new AddressDTO(102,"President's Secretariat","New Delhi","karnataka",new Country1DTO("india",91)) ));
	map.put(new Country1DTO("india",91), new PresidentDTO("Joe Biden", "implementing and enforcing the laws ", 71,new AddressDTO(102,"Pennsylvania Avenue","Washington","DC",new Country1DTO("USA",1)) ));
	
	Set<Country1DTO> key=map.keySet();
	key.forEach(keys->System.out.println(keys));
	
	System.out.println("===============================");
	
	Collection<PresidentDTO> values=map.values();
	values.forEach(value->System.out.println(value));
	
	System.out.println("===============================");
	
	Set<Map.Entry<Country1DTO, PresidentDTO>> entry=map.entrySet();
	entry.forEach(entries->System.out.println(entries.getKey()+" : "+entries.getValue()));
	
	
	}

}

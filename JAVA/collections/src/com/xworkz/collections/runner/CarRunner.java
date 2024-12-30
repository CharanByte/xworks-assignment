package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collections.dto.CarDTO;

public class CarRunner {

	public static void main(String[] args) {
		
		CarDTO carDTO=new CarDTO();
		List<CarDTO> list=new ArrayList<CarDTO>();
		list.add(new CarDTO(1));
		list.add(new CarDTO(4));
		list.add(new CarDTO(3));
		
		
	list.stream().forEach(ref->System.out.println(ref));
		
		//list.stream().sorted().forEach(ref2->System.out.println(ref2));
	
	
	list.remove(1);
	list.stream().forEach(ref->System.out.println(ref));
	

	}

}

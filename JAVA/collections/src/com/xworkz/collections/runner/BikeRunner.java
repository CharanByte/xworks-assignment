package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

public class BikeRunner {

	public static void main(String[] args) {

		List<Double> list=new ArrayList<>();
		list.add(1.4);
		list.add(1.2);
		list.add(1.4);
		list.add(null);
		list.add(2.3);
		list.add(4.1);
		list.add(2.1);
		list.add(3.0);
		list.add(3.0);
		list.add(3.0);
		
		System.out.println("bofore clear : "+list);
		
		System.out.println("bofore clear size : "+list.size());
		
		list.clear();
		System.out.println(list);
		System.out.println("after clear : "+list.size());
		
		

	}

}

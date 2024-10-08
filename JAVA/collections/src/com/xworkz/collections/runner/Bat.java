package com.xworkz.collections.runner;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bat {

	public static void main(String[] args) {
		Collection<Long> collections = new LinkedList();
		collections.add(782L);
		collections.add(882L);
		collections.add(892L);
		collections.add(287L);
		collections.add(89L);
		collections.add(62L);
		collections.add(98392L);
		collections.add(3989L);
		collections.add(7828L);
		collections.add(28L);
		System.out.println(" Sorted in ascending order");
		collections.stream().sorted().collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println(" Sorted in descending order");
		collections.stream().sorted((ref1, ref2) -> Long.compare(ref2, ref1)).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		
		System.out.println("===================================");

		Collection<String> collection1=new LinkedList<>();
		collection1.add("Jawaharlal Nehru");
		collection1.add("Gulzarilal Nanda ");
		collection1.add("Lal Bahadur Shastri ");
		collection1.add("Indira Gandhi ");
		collection1.add("Morarji Desai");
		collection1.add("Charan Singh");
		collection1.add("Rajiv Gandhi");
		collection1.add("V. P. Singh");
		collection1.add("Chandra Shekhar");
		collection1.add("P. V. Narasimha Rao");
		collection1.add("Atal Bihari Vajpayee");
		collection1.add("H. D. Deve Gowda");
		collection1.add("I. K. Gujral ");
		collection1.add("Manmohan Singh ");
		collection1.add("Narendra Modi ");

		System.out.println(" Sorted in ascending order");
		collection1.stream().sorted((ref1,ref2)->ref1.compareTo(ref2)).collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		System.out.println(" Sorted in descending order");
		collection1.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		
		System.out.println("================================");
		LinkedList<String> collection2=new LinkedList<String>();
		collection2.add("Andhra Pradesh ");
		collection2.add("Arunachal Pradesh ");
		collection2.add("Assam");
		collection2.add("Bihar");
		collection2.add("Chhattisgarh");
		collection2.add("Goa");
		collection2.add("Gujarat");
		collection2.add("Haryana");
		collection2.add("Himachal Pradesh");
		collection2.add("Jharkhand");
		collection2.add("Karnataka");
		collection2.add("Kerala");
		collection2.add("Madhya Pradesh");
		collection2.add("Maharashtra");
		collection2.add("Manipur");
		collection2.add("Meghalaya");
		collection2.add("Mizoram");
		collection2.add("Nagaland");
		collection2.add("Nagaland");
		collection2.add("Punjab");
		collection2.add("Rajasthan");
		collection2.add("Sikkim");
		collection2.add("Tamil Nadu");
		collection2.add("Telangana");
		collection2.add("Tripura");
		collection2.add("Uttar Pradesh");
		collection2.add("Uttarakhand");
		collection2.add("West Bengal");
		
//		System.out.println(" Sorted in ascending order");
//		Collections.sort(collection2);
//		System.out.println(collection2);
//		
//		System.out.println(" Sorted in descending order");
//
//		Collections.sort(collection2, Collections.reverseOrder());
//		System.out.println(collection2);
		
		
		System.out.println(" Sorted in ascending order");
		collection2.stream().sorted((ref1,ref2)->ref1.compareTo(ref2)).collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		System.out.println(" Sorted in descending order");
		collection2.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		
		
	}

}

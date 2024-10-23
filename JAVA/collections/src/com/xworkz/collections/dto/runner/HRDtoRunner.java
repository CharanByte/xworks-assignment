package com.xworkz.collections.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.collections.dto.HRDto;

public class HRDtoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRDto dto=new HRDto("raju", "BE", 4, "Bengaluru");
		HRDto dto1=new HRDto("Ajay", "MBA", 3, "delhi");
		HRDto dto2=new HRDto("ramu", "BE", 2, "Bengaluru");
		HRDto dto3=new HRDto("sachin", "MCA", 7, "hyderabad");
		HRDto dto4=new HRDto("abhi", "BCA", 4, "pune");
		HRDto dto5=new HRDto("naga", "BE", 5, "Bengaluru");
		HRDto dto6=new HRDto("shashank", "BE", 6, "Bengaluru");
		HRDto dto7=new HRDto("Arun", "BE", 3, "chennai");
		HRDto dto8=new HRDto("nandan", "BE", 2, "Bengaluru");
		HRDto dto9=new HRDto("likith", "BE", 1, "chennai");
		
		LinkedList<HRDto> collection =new LinkedList<HRDto>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		
		
		collection.stream().filter(ref->ref.getLocation().equals("Bengaluru")).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().filter(ref->ref.getTotalExp()>5).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().filter(ref->ref.getName().endsWith("r")).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().map(ref->ref.getLocation()).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().map(ref->ref.getLocation()).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		
		collection.stream().sorted((ref1,ref2)->ref1.getName().compareTo(ref2.getName())).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().sorted((ref1,ref2)->ref1.getQualification().compareTo(ref2.getQualification())).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		collection.stream().sorted((ref1,ref2)->Double.compare(ref2.getTotalExp(),ref1.getTotalExp())).forEach(ref->System.out.println(ref));
		System.out.println("**********************");
		
		Iterator<HRDto> iterator=collection.iterator();
		while (iterator.hasNext()) {
			HRDto ref = iterator.next();

			if (ref.getName().startsWith("A")) {
				iterator.remove();
				
			}
	
	}
		System.out.println("**********************");
		ListIterator<HRDto> listIterator=collection.listIterator(collection.size());
		
		while (listIterator.hasPrevious()) {
			HRDto ref = listIterator.previous();
			System.out.println(ref);
		}
		

	}
}

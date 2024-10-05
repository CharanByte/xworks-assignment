package com.xworkz.collections.dto.runner;

import java.util.*;

import com.xworkz.collections.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {

		MatchBoxDTO matchBox1 = new MatchBoxDTO(2, "Raja");
		MatchBoxDTO matchBox2 = new MatchBoxDTO(3, "Nectar");
		MatchBoxDTO matchBox3 = new MatchBoxDTO(5, "Sri Kaliswari ");
		MatchBoxDTO matchBox4 = new MatchBoxDTO(10, "Asia Match ");
		MatchBoxDTO matchBox5 = new MatchBoxDTO(20, "Malaimahudam");

		Collection<MatchBoxDTO> collection = new LinkedList<>();

		collection.add(matchBox1);
		collection.add(matchBox2);
		collection.add(matchBox3);
		collection.add(matchBox4);
		collection.add(matchBox5);

		System.out.println("size : " + collection.size());
		System.out.println(collection);

//		collection.clear();
//		System.out.println("isEmpty : " + collection.isEmpty());

//		System.out.println("after clear");
//		System.out.println("size : " + collection.size());
//		System.out.println("isEmpty : " + collection.isEmpty());
//
//		System.out.println(collection);

		
		Iterator<MatchBoxDTO> iterator=collection.iterator();
		
		while (iterator.hasNext()) {
			MatchBoxDTO ref= iterator.next();
			System.out.println(ref);
		}
	}

}

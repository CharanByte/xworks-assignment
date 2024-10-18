package com.xworkz.collections.dto.runner;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collections.constants.Location;
import com.xworkz.collections.dto.MallDTO;

public class MallDTORunner {

	public static void main(String[] args) {

		LinkedList<MallDTO> collection = new LinkedList<MallDTO>();
		collection.add(new MallDTO(104, "Mantri Square Mall", Location.BENGALURU, "Mantri Developers", 200000.00));
		collection.add(new MallDTO(102, "Phoenix MarketCity", Location.CHENNAI, "The Phoenix Mills Ltd.", 60000.00));
		collection.add(new MallDTO(101, "Lulu Mall", Location.KOCHI, "Lulu Group Internationa", 70000.00));
		collection.add(new MallDTO(107, "The Forum Mall", Location.BENGALURU, "Prestige Group", 100000.00));
		collection.add(new MallDTO(108, "Orion Mall", Location.BENGALURU, "Brigade Group", 300000.00));
		collection.add(new MallDTO(109, "VR Chenna", Location.CHENNAI, "Virtuous Retail", 60000.00));
		collection.add(new MallDTO(103, "Express Avenue", Location.CHENNAI, "Indian Express Group", 900000.00));
		collection.add(new MallDTO(105, "Inorbit Mall", Location.HYDERABAD, "K. Raheja Corporation", 40000.00));
		collection.add(new MallDTO(106, "Forum Sujana Mall", Location.HYDERABAD, "Prestige Group", 600000.00));
		collection.add(new MallDTO(110, "UB City", Location.BENGALURU, "UB Group and Prestige Group", 50000.00));

		collection.stream().sorted((ref1, ref2) -> Integer.compare(ref1.getId(), ref2.getId()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println(
				"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		collection.stream().sorted((ref1, ref2) -> ref2.getName().compareTo(ref1.getName()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println(
				"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Iterator<MallDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {

			MallDTO mallDTO = iterator.next();
			if (mallDTO.getId() == 103) {
				iterator.remove();

			} else {
				System.out.println(mallDTO);
			}

		}

		System.out.println(	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ListIterator<MallDTO> listIterator = collection.listIterator(0);

		while (listIterator.hasNext()) {

			MallDTO ref = listIterator.next();
			if (ref.getId() == 10)
				listIterator.add(new MallDTO(11, "GT", Location.BENGALURU, "Michael ", 5000.0));
		}
		
		collection.forEach(ref -> System.out.println(ref));
		System.out.println(	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


		ListIterator<MallDTO> listItr1 = collection.listIterator(collection.size());
		while (listItr1.hasPrevious()) {
			MallDTO ref = listItr1.previous();
			System.out.println(ref);
		}
		System.out.println(	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
		ListIterator<MallDTO> listItr3 = collection.listIterator(5);
		while (listItr3.hasNext()) {
			MallDTO ref = listItr3.next();
			System.out.println(ref);
			
			
		}
		collection.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName())).collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref));

		System.out.println(	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		collection.stream().filter(ref -> ref.getLandDimension() < 100000).forEach((ref) -> System.out.println(ref));
		System.out.println(	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		collection  .stream().map(names -> names.getName()).forEach(ref -> System.out.println(ref));
	}

}

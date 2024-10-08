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

	}

}

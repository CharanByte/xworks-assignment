package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MobileRunner {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<>();
		map.put(9741591749L, "charan");
		map.put(9483310333L, "charan");
		map.put(9765265253L, "Ajay");
		map.put(8756565678L, "Sachin");
		map.put(8656255277L, "deekshit");

		Set<Long> keys = map.keySet();
		keys.forEach(key -> System.out.println(key));

		System.out.println("==============================");

		Collection<String> values = map.values();
		values.forEach(value -> System.out.println(value));

		System.out.println("==============================");

		Set<Map.Entry<Long, String>> entries = map.entrySet();
		entries.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));

	}

}

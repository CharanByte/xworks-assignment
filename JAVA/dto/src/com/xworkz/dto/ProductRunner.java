package com.xworkz.dto;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.dto.productdto.ProductDTO;

public class ProductRunner {
	public static void main(String[] args) {
		ProductDTO dto = new ProductDTO(1, "shoe", "nike", 5000);
		ProductDTO dto0 = new ProductDTO(1, "shoe", "nike", 5000);
		ProductDTO dto1 = new ProductDTO(2, "TV", "Lg", 40000);
		ProductDTO dto2 = new ProductDTO(3, "Bat", "MRF", 3000);
		ProductDTO dto3 = new ProductDTO(4, "Laptop", "Dell", 700000);
		ProductDTO dto4 = new ProductDTO(5, "Mobile", "Redmi", 15000);
		ProductDTO dto5 = new ProductDTO(6, "watch", "titan", 2000);
		ProductDTO dto6 = new ProductDTO(7, "Bag", "Wildcart", 1000);
		ProductDTO dto7 = new ProductDTO(8, "airpods", "Boat", 1000);
		ProductDTO dto8 = new ProductDTO(9, "radio", "", 5000);
		ProductDTO dto9 = new ProductDTO(10, "shoe", "nike", 5000);
		ProductDTO dto10 = new ProductDTO(11, "shoe", "nike", 5000);

		Collection<ProductDTO> collection = new LinkedList<ProductDTO>();
		collection.add(dto);
		collection.add(dto0);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		collection.forEach((product) -> System.out.println(product));

		System.out.println("*******************************");

		collection.stream().sorted().forEach((ref) -> System.out.println(ref));

		System.out.println("****************************");

		collection.stream().filter(product -> product.getCost() > 5000).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("****************************");

		collection.stream().filter(product -> product.getCost() > 5000 && product.getCost() < 30000)
				.collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));

		System.out.println("*****************************");

		collection.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("****************************");

		collection.stream().filter(product -> product.getVendor().startsWith("S")).sorted().collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("********************************");

		collection.stream().map(product -> product.getName()).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("******************************");

		collection.stream().map(product -> product.getId()).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("*********************************");

		collection.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));
	}
}

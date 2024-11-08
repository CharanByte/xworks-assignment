package com.xworkz.product.runner;

import java.util.HashSet;
import java.util.Set;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		set.add(100);//hashcode-->group
		set.add(254);//hashcode-->group
		set.add(365);
		set.add(433);
		set.add(365);//hascode-->equals:true
		
		for (Integer integer : set) {
			System.out.println(integer);
		}

	}

}

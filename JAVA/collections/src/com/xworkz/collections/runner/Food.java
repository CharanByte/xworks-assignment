package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.List;



public class Food {
	
String name="charan";
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hi";
	}

	public static void main(String[] args) {
	
		Food food=new Food();
		System.out.println(food);
		List<String> list=new ArrayList<>();
		list.add("idly");
		list.add("dosa");
		list.add("Jolada Rotti");
		list.add("curry");
		list.add("Maddur Vada");
		list.add("Neer Dosa");
		list.add("Ragi Mudde");
		list.add(null);
		list.add("Bisi Bele Bath");
		list.add("");
		System.out.println("bofore clear : "+list);
		
		System.out.println("bofore clear size : "+list.size());
		
		list.clear();
		System.out.println(list);
		System.out.println("after clear : "+list.size());
		
		
		

	}

}

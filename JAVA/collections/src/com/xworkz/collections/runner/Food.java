package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.List;



public class Food {
	
String name="charan";
int age;
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hi";
	}





	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}





@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Food other = (Food) obj;
	if (age != other.age)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
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

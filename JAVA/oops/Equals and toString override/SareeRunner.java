package com.xworkz.casting.internal;

public class SareeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saree saree1=new Saree("red", 2000, "fabric", "COSBILAFASHION", 3.9, true);
		
		Saree saree2=new Saree("blue", 2000, "fabric", "COSBILAFASHION", 3.9, true);
		
		boolean result=saree1.equals(saree2);
		System.out.println(result);
	}

}

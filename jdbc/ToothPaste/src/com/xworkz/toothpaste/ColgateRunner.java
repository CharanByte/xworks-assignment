package com.xworkz.toothpaste;

public class ColgateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.xworkz.toothpaste.Colgate");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}

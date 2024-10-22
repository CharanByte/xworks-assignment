package com.xworkz.mobile;

public class RedmiRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.mobile.Redmi");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

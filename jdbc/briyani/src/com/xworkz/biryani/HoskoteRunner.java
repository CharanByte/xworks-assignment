package com.xworkz.biryani;

public class HoskoteRunner {

	public static void main(String[] args)  {
		
		try {
			Class.forName("com.xworkz.biryani.Hoskote");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

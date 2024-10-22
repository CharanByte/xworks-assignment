package com.xworkz.ironbox;

public class PrestigeRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.ironbox.Prestige");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	

}

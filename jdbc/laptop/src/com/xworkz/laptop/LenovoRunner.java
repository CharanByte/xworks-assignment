package com.xworkz.laptop;

public class LenovoRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.laptop.Lenovo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

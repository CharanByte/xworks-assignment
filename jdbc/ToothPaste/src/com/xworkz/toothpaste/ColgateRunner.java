package com.xworkz.toothpaste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ColgateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("running");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Class.forName("com.xworkz.toothpaste.Colgate");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}

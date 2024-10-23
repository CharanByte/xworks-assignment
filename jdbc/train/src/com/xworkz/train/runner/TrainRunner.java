package com.xworkz.train.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrainRunner {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/demo";
		String userName="root";
		String password="charan";
		
		Connection connection;
		
	try {
		connection=	DriverManager.getConnection(url, userName, password);
		
		if(connection!=null) {
			System.out.println("connection created ");
		}
		else {
			System.out.println("connection not created");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

package com.xworkz.school.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SchoolRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String password="charan";
		
		Connection connection=null;
		
	try {
		connection=	DriverManager.getConnection(url, userName, password);
		if(connection!=null) 
			System.out.println("connection created");
		else
			System.out.println("connection not created");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}

}

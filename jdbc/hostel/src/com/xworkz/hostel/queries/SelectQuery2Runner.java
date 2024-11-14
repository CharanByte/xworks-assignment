package com.xworkz.hostel.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.xworkz.hostel.constants.HostelConnection;

public class SelectQuery2Runner {

	public static void main(String[] args) {
		String selectQuery2 = "select name from hostel_table where email='Priya@gamil.com' and password='Priya';";
		
		Connection connection=null;
	
			try {
				connection=DriverManager.getConnection(HostelConnection.URL.getValue(),HostelConnection.USERNAME.getValue(),HostelConnection.PASSWORD.getValue());
				PreparedStatement statement=connection.prepareStatement(selectQuery2);
				ResultSet resultSet1= statement.executeQuery();
				
				while (resultSet1.next()) {
					System.out.println(resultSet1.getString("name"));
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}

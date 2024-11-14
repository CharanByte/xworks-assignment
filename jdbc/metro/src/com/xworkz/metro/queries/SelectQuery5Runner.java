package com.xworkz.metro.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.metro.constants.MetroConnection;



public class SelectQuery5Runner {
	
	public static void main(String[] args) {

		String selectQuery5 = "select email,password from metro_table where phone_number='1098765432' and name='Rajesh Gupta';";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(MetroConnection.URL.getValue(),
					MetroConnection.USERNAME.getValue(), MetroConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery5);
			ResultSet resultSet1 = statement.executeQuery();

			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("email"));
				System.out.println(resultSet1.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

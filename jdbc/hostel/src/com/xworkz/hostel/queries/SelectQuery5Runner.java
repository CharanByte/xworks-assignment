package com.xworkz.hostel.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hostel.constants.HostelConnection;

public class SelectQuery5Runner {

	public static void main(String[] args) {

		String selectQuery5 = "select email,password from hostel_table where phone_number='9876543210' and name='Amit';";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(HostelConnection.URL.getValue(),
					HostelConnection.USERNAME.getValue(), HostelConnection.PASSWORD.getValue());
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

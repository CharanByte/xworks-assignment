package com.xworkz.hostel.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hostel.constants.HostelConnection;

public class SelectQuery4Runner {

	public static void main(String[] args) {
		String selectQuery4 = "select email,password from hostel_table where phone_number='0987654321';";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(HostelConnection.URL.getValue(),
					HostelConnection.USERNAME.getValue(), HostelConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery4);
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

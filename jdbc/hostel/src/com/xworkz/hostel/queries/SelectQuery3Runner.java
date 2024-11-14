package com.xworkz.hostel.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hostel.constants.HostelConnection;

public class SelectQuery3Runner {

	public static void main(String[] args) {

		String selectQuery3 = "select address from hostel_table where name='Anjali' and phone_number='6543210987';";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(HostelConnection.URL.getValue(),
					HostelConnection.USERNAME.getValue(), HostelConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery3);
			ResultSet resultSet1 = statement.executeQuery();

			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("address"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

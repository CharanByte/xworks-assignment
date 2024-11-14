package com.xworkz.metro.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.metro.constants.MetroConnection;

public class SelectQuery3Runner {
	public static void main(String[] args) {

		String selectQuery3 = "select address from metro_table where name='Suresh Kumar' and phone_number='3210987654';";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(MetroConnection.URL.getValue(),
					MetroConnection.USERNAME.getValue(), MetroConnection.PASSWORD.getValue());
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

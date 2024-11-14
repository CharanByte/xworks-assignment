package com.xworkz.metro.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.metro.constants.MetroConnection;

public class SelectQuery1Runner {
	public static void main(String[] args) {
		String selectQuery1 = "select * from metro_table";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(MetroConnection.URL.getValue(),
					MetroConnection.USERNAME.getValue(), MetroConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery1);
			ResultSet resultSet1 = statement.executeQuery(selectQuery1);
			while (resultSet1.next()) {
				int id = resultSet1.getInt("id");
				String name = resultSet1.getString("name");
				String email = resultSet1.getString("email");
				String password = resultSet1.getString("password");
				String address = resultSet1.getString("address");
				String phonenumber = resultSet1.getString("phone_number");
				String ticket_number = resultSet1.getString("ticket_number");
				String journey_date = resultSet1.getString("journey_date");
				String departure_station = resultSet1.getString("departure_station");
				String arrival_station = resultSet1.getString("arrival_station");

				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", password: " + password
						+ ",Phone Number: " + phonenumber + ", address: " + address + ", ticket_number: "
						+ ticket_number + ", journey_date: " + journey_date + ", departure_station: "
						+ departure_station + ", arrival_station: " + arrival_station);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

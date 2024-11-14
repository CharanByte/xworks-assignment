package com.xworkz.hostel.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hostel.constants.HostelConnection;

public class SelectQuery1Runner {

	public static void main(String[] args) {
		String selectQuery1 = "select * from hostel_table";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(HostelConnection.URL.getValue(),
					HostelConnection.USERNAME.getValue(), HostelConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery1);
			ResultSet resultSet1 = statement.executeQuery(selectQuery1);
			while (resultSet1.next()) {
				int id = resultSet1.getInt("id");
				String name = resultSet1.getString("name");
				String email = resultSet1.getString("email");
				String password = resultSet1.getString("password");
				String address = resultSet1.getString("address");
				String phonenumber = resultSet1.getString("phone_number");
				int room_number = resultSet1.getInt("room_number");
				String check_in_date = resultSet1.getString("check_in_date");
				String check_out_date = resultSet1.getString("check_out_date");
				int fees_paid = resultSet1.getInt("fees_paid");

				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", password: " + password
						+ ",Phone Number: " + phonenumber + ", address: " + address + ", room_number: " + room_number
						+ ", check_in_date: " + check_in_date + ", check_out_date: " + check_in_date + ", fees_paid: "
						+ fees_paid);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

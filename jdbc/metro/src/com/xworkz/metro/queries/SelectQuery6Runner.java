package com.xworkz.metro.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.metro.constants.MetroConnection;

public class SelectQuery6Runner {

	public static void main(String[] args) {
		String selectQuery6 = "select name from metro_table where id>5";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(MetroConnection.URL.getValue(),
					MetroConnection.USERNAME.getValue(), MetroConnection.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(selectQuery6);
			ResultSet resultSet1 = statement.executeQuery();

			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("name"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

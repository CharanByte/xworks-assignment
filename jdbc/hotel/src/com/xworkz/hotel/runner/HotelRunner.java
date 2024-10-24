package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hotel";
		String userName = "root";
		String password = "charan";
		String insertQuery = "insert into hotel_table values(1, 'Spice Terrace', 'JW Marriott Bengaluru', '4.5'),"
				+ "(2, 'The Cafe', 'Taj West End Bengaluru', '4.6'),"
				+ "(3, 'Karavalli', 'The Gateway Hotel Bengaluru', '4.7'),"
				+ "(4, 'Cubbon Pavilion', 'ITC Gardenia Bengaluru', '4.5'),"
				+ "(5, 'Lapis', 'The Oberoi Bengaluru', '4.8'),"
				+ "(6, 'Saffron', 'Shangri-La Hotel Bengaluru', '4.7'),"
				+ "(7, 'Alba', 'JW Marriott Bengaluru', '4.4'),"
				+ "(8, 'The Lantern', 'The Ritz-Carlton Bengaluru', '4.9'),"
				+ "(9, 'Yauatcha', 'MG Road Bengaluru', '4.6')," + "(10, 'Sly Granny', 'Indiranagar Bengaluru', '4.4'),"
				+ "(11, 'Toit', 'Indiranagar Bengaluru', '4.3'),"
				+ "(12, 'The Fatty Bao', 'Indiranagar Bengaluru', '4.5'),"
				+ "(13, 'Smoke House Deli', 'Lavelle Road Bengaluru', '4.2'),"
				+ "(14, 'Mikusu', 'Conrad Bengaluru', '4.8')," + "(15, 'Caprese', 'Shangri-La Hotel Bengaluru', '4.6'),"
				+ "(16, 'Tiamo', 'Conrad Bengaluru', '4.5'),"
				+ "(17, 'The Bengaluru Brasserie', 'Hyatt Centric MG Road Bengaluru', '4.7'),"
				+ "(18, 'Biergarten', 'Whitefield Bengaluru', '4.3'),"
				+ "(19, 'The Biere Club', 'Lavelle Road Bengaluru', '4.4'),"
				+ "(20, 'Ebony', 'MG Road Bengaluru', '4.6')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				System.out.println("created");
			}
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(insertQuery);
			if (result > 0)
				System.out.println("Saved");
			else
				System.err.println("Not Saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

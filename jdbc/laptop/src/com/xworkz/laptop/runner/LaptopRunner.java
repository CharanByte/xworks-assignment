package com.xworkz.laptop.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/laptop";
		String userName="root";
		String password="charan";
		String insertQuery="insert into laptop_table values (101, 'Dell', '120000'),"+
				"(2, 'MacBook Air 2', '99900'),"+
				"(3, 'HP Spectre', '130000'),"+
				"(4, 'Lenovo', '140000'),"+
				"(5, 'Asus ', '110000'),"+
				"(6, 'Acer Swift ', '70000'),"+
				"(7, 'Microsoft Surface Laptop 4', '150000'),"+
				"(8, 'Razer Blade Stealth 13', '160000'),"+
				"(9, 'LG Gram 17', '1800 USD'),"+
				"(10, 'Samsung Galaxy Book Flex', '120000'),"+
				"(11, 'Google Pixelbook Go', '85000'),"+
				"(12, 'Huawei MateBook X Pro', '170000'),"+
				"(13, 'lenovo', '20000'),"+
				"(14, 'MSI ', '21000'),"+
				"(15, 'Gigabyte Aero 15', '1900 USD'),"+
				"(16, 'Dell G5 15 SE', '1000 USD'),"+
				"(17, 'Asus ROG Zephyrus G14', '1600 USD'),"+
				"(18, 'HP 13', '950 USD'),"+
				"(19, 'Apple MacBook Pro 16', '2400 USD'),"+
				"(20, 'Lenovo Yoga ', '1300 USD')";

		
		Connection connection=null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null)
				System.out.println("connected");
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

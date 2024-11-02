package com.xworkz.perfume.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Perfume {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/perfume";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO perfume_table  VALUES (1, 'Chanel No. 5', '150.00'),"+
				"(2, 'Dior Sauvage', '120.00'),"+
				"(3, 'Giorgio Armani Acqua Di Gio', '105.00'),"+
				"(4, 'Yves Saint Laurent Black Opium', '130.00'),"+
				"(5, 'Tom Ford Black Orchid', '150.00'),"+
				"(6, 'Versace Eros', '95.00'),"+
				"(7, 'Gucci Bloom', '100.00'),"+
				"(8, 'Calvin Klein Eternity', '75.00'),"+
				"(9, 'Prada Luna Rossa', '115.00'),"+
				"(10, 'Marc Jacobs Daisy', '85.00'),"+
				"(11, 'Paco Rabanne 1 Million', '125.00'),"+
				"(12, 'Hermès Terre d’Hermès', '145.00'),"+
				"(13, 'Dolce & Gabbana Light Blue', '110.00'),"+
				"(14, 'Jo Malone London Peony & Blush Suede', '135.00'),"+
				"(15, 'Lancome La Vie Est Belle', '140.00'),"+
				"(16, 'Bvlgari Man in Black', '125.00'),"+
				"(17, 'Maison Margiela Replica By the Fireplace', '135.00'),"+
				"(18, 'Jean Paul Gaultier Le Male', '90.00'),"+
				"(19, 'Creed Aventus', '300.00'),"+
				"(20, 'Burberry Brit', '85.00')";

		String updateQuery1="UPDATE perfume_table SET perfume_price = '160.00' WHERE id = 1";
		String updateQuery2="UPDATE perfume_table SET perfume_price = '130.00' WHERE id = 2";
		String updateQuery3="UPDATE perfume_table SET perfume_price = '115.00' WHERE id = 3";
		String updateQuery4="UPDATE perfume_table SET perfume_price = '140.00' WHERE id = 4";
		String updateQuery5="UPDATE perfume_table SET perfume_price = '160.00' WHERE id = 5";
		String updateQuery6="UPDATE perfume_table SET perfume_price = '105.00' WHERE id = 6";
		String updateQuery7="UPDATE perfume_table SET perfume_price = '110.00' WHERE id = 7";
		String updateQuery8="UPDATE perfume_table SET perfume_price = '85.00' WHERE id = 8";
		String updateQuery9="UPDATE perfume_table SET perfume_price = '125.00' WHERE id = 9";
		String updateQuery10="UPDATE perfume_table SET perfume_price = '95.00' WHERE id = 10";
		
		Connection connection=null;
		
		try {
			connection =DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(updateQuery10);
			if(value>0) 
				System.out.println("saved");
			else
				System.out.println("not saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

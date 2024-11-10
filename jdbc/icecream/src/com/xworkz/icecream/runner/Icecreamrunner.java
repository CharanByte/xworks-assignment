package com.xworkz.icecream.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Icecreamrunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/icecream";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO icecream_table VALUES(1, 'Vanilla', '2.50'),"+
				"(2, 'Chocolate', '3.00'),"+
				"(3, 'Strawberry', '2.75'),"+
				"(4, 'Mint Chocolate Chip', '3.25'),"+
				"(5, 'Cookie Dough', '3.50'),"+
				"(6, 'Rocky Road', '3.75'),"+
				"(7, 'Butter Pecan', '3.00'),"+
				"(8, 'Neapolitan', '3.20'),"+
				"(9, 'Pistachio', '3.60'),"+
				"(10, 'Mango', '3.40'),"+
				"(11, 'Lemon', '2.90'),"+
				"(12, 'Cookies and Cream', '3.30'),"+
				"(13, 'Birthday Cake', '3.80'),"+
				"(14, 'Coffee', '3.10'),"+
				"(15, 'Salted Caramel', '3.50'),"+
				"(16, 'Raspberry', '3.20'),"+
				"(17, 'Green Tea', '3.70'),"+
				"(18, 'Coconut', '3.40'),"+
				"(19, 'Peach', '3.00'),"+
				"(20, 'Blueberry', '3.60')";
	
		String updateQuery1="UPDATE `icecream_table` SET `icecream_cost` = '1600' WHERE `id` = 1";
		String updateQuery2="UPDATE `icecream_table` SET `icecream_cost` = '1350' WHERE `id` = 2";
		String updateQuery3="UPDATE `icecream_table` SET `icecream_cost` = '1250' WHERE `id` = 3";
		String updateQuery4="UPDATE `icecream_table` SET `icecream_cost` = '1450' WHERE `id` = 4";
		String updateQuery5="UPDATE `icecream_table` SET `icecream_cost` = '1650' WHERE `id` = 5";
		String updateQuery6="UPDATE `icecream_table` SET `icecream_cost` = '1150' WHERE `id` = 6";
		String updateQuery7="UPDATE `icecream_table` SET `icecream_cost` = '1400' WHERE `id` = 7";
		String updateQuery8="UPDATE `icecream_table` SET `icecream_cost` = '1300' WHERE `id` = 8";
		String updateQuery9="UPDATE `icecream_table` SET `icecream_cost` = '1600' WHERE `id` = 9";
		String updateQuery10="UPDATE `icecream_table` SET `icecream_cost` = '1500' WHERE `id` = 10";
		
		String deleteQuery1 = "delete from icecream_table where id=11";
		String deleteQuery2 = "delete from icecream_table where id=12";
		String deleteQuery3 = "delete from icecream_table where id=13";
		String deleteQuery4 = "delete from icecream_table where id=14";
		String deleteQuery5 = "delete from icecream_table where id=15";
		String deleteQuery6 = "delete from icecream_table where id=16";
		String deleteQuery7 = "delete from icecream_table where id=17";
		String deleteQuery8 = "delete from icecream_table where id=18";
		String deleteQuery9 = "delete from icecream_table where id=19";
		String deleteQuery10 = "delete from icecream_table where id=20";

		Connection connection=null;
		
		try {
			connection =DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(deleteQuery10);
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

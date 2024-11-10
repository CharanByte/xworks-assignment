package com.xworkz.cigarette.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigaretteRuuner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/cigarette";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO cigarette_table VALUES(1, 'Gold Flake Kings', '150'),"+
				"(2, 'Gold Flake Lights', '140'),"+
				"(3, 'Classic Regular', '200'),"+
				"(4, 'Classic Milds', '190'),"+
				"(5, 'Wills Navy Cut', '160'),"+
				"(6, 'Benson & Hedges', '250'),"+
				"(7, 'Four Square', '120'),"+
				"(8, 'Navy Cut Filter', '180'),"+
				"(9, 'Marlboro Red', '300'),"+
				"(10, 'Marlboro Gold', '280'),"+
				"(11, 'Camel', '270'),"+
				"(12, 'Charms', '130'),"+
				"(13, 'Parliament', '350'),"+
				"(14, 'Dunhill', '400'),"+
				"(15, 'Pall Mall', '240'),"+
				"(16, 'Lucky Strike', '260'),"+
				"(17, 'Davidoff', '500'),"+
				"(18, 'Insignia', '220'),"+
				"(19, 'West', '210'),"+
				"(20, 'Monte Carlo', '230')";
		
		String updateQuery1 = "UPDATE `cigarette_table` SET `cigarette_price` = '160' WHERE `id` = 1;";
        String updateQuery2 = "UPDATE `cigarette_table` SET `cigarette_price` = '150' WHERE `id` = 2;";
        String updateQuery3 = "UPDATE `cigarette_table` SET `cigarette_price` = '210' WHERE `id` = 3;";
        String updateQuery4 = "UPDATE `cigarette_table` SET `cigarette_price` = '200' WHERE `id` = 4;";
        String updateQuery5 = "UPDATE `cigarette_table` SET `cigarette_price` = '170' WHERE `id` = 5;";
        String updateQuery6 = "UPDATE `cigarette_table` SET `cigarette_price` = '260' WHERE `id` = 6;";
        String updateQuery7 = "UPDATE `cigarette_table` SET `cigarette_price` = '130' WHERE `id` = 7;";
        String updateQuery8 = "UPDATE `cigarette_table` SET `cigarette_price` = '190' WHERE `id` = 8;";
        String updateQuery9 = "UPDATE `cigarette_table` SET `cigarette_price` = '320' WHERE `id` = 9;";
        String updateQuery10 = "UPDATE `cigarette_table` SET `cigarette_price` = '300' WHERE `id` = 10;";
		
		String deleteQuery1 = "delete from cigarette_table where id=11";
		String deleteQuery2 = "delete from cigarette_table where id=12";
		String deleteQuery3 = "delete from cigarette_table where id=13";
		String deleteQuery4 = "delete from cigarette_table where id=14";
		String deleteQuery5 = "delete from cigarette_table where id=15";
		String deleteQuery6 = "delete from cigarette_table where id=16";
		String deleteQuery7 = "delete from cigarette_table where id=17";
		String deleteQuery8 = "delete from cigarette_table where id=18";
		String deleteQuery9 = "delete from cigarette_table where id=19";
		String deleteQuery10 = "delete from cigarette_table where id=20";

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

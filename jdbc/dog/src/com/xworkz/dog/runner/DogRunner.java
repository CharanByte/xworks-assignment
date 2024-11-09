package com.xworkz.dog.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DogRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dog_data";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO dog_table VALUES(1, 'Buddy', '1500'),"+
				"(2, 'Bella', '1300'),"+
				"(3, 'Charlie', '1200'),"+
				"(4, 'Lucy', '1400'),"+
				"(5, 'Max', '1600'),"+
				"(6, 'Daisy', '1100'),"+
				"(7, 'Bailey', '1350'),"+
				"(8, 'Lola', '1250'),"+
				"(9, 'Rocky', '1550'),"+
				"(10, 'Sadie', '1450'),"+
				"(11, 'Cooper', '1150'),"+
				"(12, 'Molly', '1500'),"+
				"(13, 'Tucker', '1300'),"+
				"(14, 'Maggie', '1200'),"+
				"(15, 'Jake', '1400'),"+
				"(16, 'Zoey', '1600'),"+
				"(17, 'Jack', '1100'),"+
				"(18, 'Sophie', '1350'),"+
				"(19, 'Bear', '1250'),"+
				"(20, 'Riley', '1550')";

	
		String updateQuery1="UPDATE `dog_table` SET `dog_price` = '1600' WHERE `id` = 1";
		String updateQuery2="UPDATE `dog_table` SET `dog_price` = '1350' WHERE `id` = 2";
		String updateQuery3="UPDATE `dog_table` SET `dog_price` = '1250' WHERE `id` = 3";
		String updateQuery4="UPDATE `dog_table` SET `dog_price` = '1450' WHERE `id` = 4";
		String updateQuery5="UPDATE `dog_table` SET `dog_price` = '1650' WHERE `id` = 5";
		String updateQuery6="UPDATE `dog_table` SET `dog_price` = '1150' WHERE `id` = 6";
		String updateQuery7="UPDATE `dog_table` SET `dog_price` = '1400' WHERE `id` = 7";
		String updateQuery8="UPDATE `dog_table` SET `dog_price` = '1300' WHERE `id` = 8";
		String updateQuery9="UPDATE `dog_table` SET `dog_price` = '1600' WHERE `id` = 9";
		String updateQuery10="UPDATE `dog_table` SET `dog_price` = '1500' WHERE `id` = 10";
		
		String deleteQuery1 = "delete from dog_table where id=11";
		String deleteQuery2 = "delete from dog_table where id=12";
		String deleteQuery3 = "delete from dog_table where id=13";
		String deleteQuery4 = "delete from dog_table where id=14";
		String deleteQuery5 = "delete from dog_table where id=15";
		String deleteQuery6 = "delete from dog_table where id=16";
		String deleteQuery7 = "delete from dog_table where id=17";
		String deleteQuery8 = "delete from dog_table where id=18";
		String deleteQuery9 = "delete from dog_table where id=19";
		String deleteQuery10 = "delete from dog_table where id=20";

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

package com.xworkz.shoe.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeRunner {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/shoe_data";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO shoe_table VALUES(1, 'Nike', '120'),"+
				"(2, 'Adidas', '110'),"+
				"(3, 'Puma', '100'),"+
				"(4, 'Reebok', '90'),"+
				"(5, 'Under Armour', '130'),"+
				"(6, 'New Balance', '115'),"+
				"(7, 'Asics', '105'),"+
				"(8, 'Skechers', '95'),"+
				"(9, 'Converse', '85'),"+
				"(10, 'Vans', '75'),"+
				"(11, 'Fila', '80'),"+
				"(12, 'Brooks', '125'),"+
				"(13, 'Saucony', '135'),"+
				"(14, 'Mizuno', '140'),"+
				"(15, 'Salomon', '150'),"+
				"(16, 'Merrell', '145'),"+
				"(17, 'Timberland', '160'),"+
				"(18, 'Hoka One One', '155'),"+
				"(19, 'Altra', '165'),"+
				"(20, 'Columbia', '170')";

	
		String updateQuery1="UPDATE `shoe_table` SET `shoe_price` = '1600' WHERE `id` = 1";
		String updateQuery2="UPDATE `shoe_table` SET `shoe_price` = '1350' WHERE `id` = 2";
		String updateQuery3="UPDATE `shoe_table` SET `shoe_price` = '1250' WHERE `id` = 3";
		String updateQuery4="UPDATE `shoe_table` SET `shoe_price` = '1450' WHERE `id` = 4";
		String updateQuery5="UPDATE `shoe_table` SET `shoe_price` = '1650' WHERE `id` = 5";
		String updateQuery6="UPDATE `shoe_table` SET `shoe_price` = '1150' WHERE `id` = 6";
		String updateQuery7="UPDATE `shoe_table` SET `shoe_price` = '1400' WHERE `id` = 7";
		String updateQuery8="UPDATE `shoe_table` SET `shoe_price` = '1300' WHERE `id` = 8";
		String updateQuery9="UPDATE `shoe_table` SET `shoe_price` = '1600' WHERE `id` = 9";
		String updateQuery10="UPDATE `shoe_table` SET `shoe_price` = '1500' WHERE `id` = 10";
		
		String deleteQuery1 = "delete from shoe_table where id=11";
		String deleteQuery2 = "delete from shoe_table where id=12";
		String deleteQuery3 = "delete from shoe_table where id=13";
		String deleteQuery4 = "delete from shoe_table where id=14";
		String deleteQuery5 = "delete from shoe_table where id=15";
		String deleteQuery6 = "delete from shoe_table where id=16";
		String deleteQuery7 = "delete from shoe_table where id=17";
		String deleteQuery8 = "delete from shoe_table where id=18";
		String deleteQuery9 = "delete from shoe_table where id=19";
		String deleteQuery10 = "delete from shoe_table where id=20";

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

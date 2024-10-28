package com.xworkz.mobiles.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mobile {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mobile";
		String userName="root";
		String password="charan";
		String insertUpdate="INSERT INTO mobile_table VALUES (1, 'iPhone 13', '999'),"
				+"(2, 'Samsung Galaxy S21', '799'),"
				+"(3, 'Google Pixel 6', '599'),"
				+"(4, 'OnePlus 9', '729'),"
				+"(5, 'Xiaomi Mi 11', '749'),"
				+"(6, 'Sony Xperia 5', '949'),"
				+"(7, 'Oppo Find X3', '699'),"
				+"(8, 'Nokia 8.3', '599'),"
				+"(9, 'Huawei P40', '899'),"
				+"(10, 'Asus ROG Phone 5', '999'),"
				+"(11, 'Realme GT', '499'),"
				+"(12, 'LG Velvet', '599'),"
				+"(13, 'Vivo X60', '679'),"
				+"(14, 'Motorola Edge 20', '699'),"
				+"(15, 'Honor 50', '549'),"
				+"(16, 'ZTE Axon 30', '599'),"
				+"(17, 'Lenovo Legion', '849'),"
				+"(18, 'Poco F3', '399'),"
				+"(19, 'Redmi Note 10', '199'),"
				+"(20, 'Samsung Galaxy A52', '349')";

		
		Connection connection=null;
		
		try {
			connection= DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(insertUpdate);
			if(value>0)
				System.out.println("saved");
			else
				System.out.println("not saved");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

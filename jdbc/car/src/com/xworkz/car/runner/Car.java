package com.xworkz.car.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Car {

	public static void main(String[] args) {
	
		String url="jdbc:mysql://localhost:3306/car";
		String userName="root";
		String password="charan";
		String insertQuery="INSERT INTO car_table  VALUES (1, 'Toyota Camry', '25000'),"+
				"(2, 'Honda Accord', '24000'),"+
				"(3, 'Ford Mustang', '35000'),"+
				"(4, 'Chevrolet Malibu', '23000'),"+
				"(5, 'Nissan Altima', '22000'),"+
				"(6, 'BMW 3 Series', '41000'),"+
				"(7, 'Audi A4', '42000'),"+
				"(8, 'Mercedes-Benz C-Class', '43000'),"+
				"(9, 'Volkswagen Passat', '27000'),"+
				"(10, 'Subaru Impreza', '21000'),"+
				"(11, 'Mazda 6', '26000'),"+
				"(12, 'Hyundai Sonata', '23000'),"+
				"(13, 'Kia Optima', '22000'),"+
				"(14, 'Tesla Model 3', '55000'),"+
				"(15, 'Volvo S60', '39000'),"+
				"(16, 'Lexus IS', '40000'),"+
				"(17, 'Jaguar XE', '47000'),"+
				"(18, 'Infiniti Q50', '38000'),"+
				"(19, 'Acura TLX', '36000'),"+
				"(20, 'Cadillac CT5', '45000')";

		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);

			if (value > 0)
				System.out.println("saved");
			else
				System.out.println("not saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

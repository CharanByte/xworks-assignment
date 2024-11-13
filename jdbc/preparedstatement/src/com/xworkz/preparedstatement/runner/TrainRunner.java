package com.xworkz.preparedstatement.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.preparedstatement.constants.BeverageConnection;
import com.xworkz.preparedstatement.constants.TrainConnection;

public class TrainRunner {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(TrainConnection.URL.getValue(),TrainConnection.USERNAME.getValue(),TrainConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into train_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "Karnataka Express");
		preparedStatement.setInt(3, 1200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "Mysore Express");
		preparedStatement.setInt(3, 1300);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "Udyan Express");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Shatabdi Express");
		preparedStatement.setInt(3, 1700);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "Rajdhani Express");
		preparedStatement.setInt(3, 1800);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "Intercity Express");
		preparedStatement.setInt(3, 1500);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "Yeshvantpur Express");
		preparedStatement.setInt(3, 2000);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "Garib Rath");
		preparedStatement.setInt(3, 1700);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "Hampi Express");
		preparedStatement.setInt(3,1600);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Kaveri Express");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "Bangalore Mail");
		preparedStatement.setInt(3, 1200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Duronto Express");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Brindavan Express");
		preparedStatement.setInt(3, 1800);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Lalbagh Express");
		preparedStatement.setInt(3, 2000);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "Chalukya Express");
		preparedStatement.setInt(3, 1300);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into book_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

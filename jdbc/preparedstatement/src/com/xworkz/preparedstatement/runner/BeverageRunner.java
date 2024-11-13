package com.xworkz.preparedstatement.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.preparedstatement.constants.BeverageConnection;
import com.xworkz.preparedstatement.constants.ConnectionEnum;

public class BeverageRunner {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(BeverageConnection.URL.getValue(),BeverageConnection.USERNAME.getValue(),BeverageConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into beverage_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "Power Cool");
		preparedStatement.setInt(3, 120);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "Kingfisher Premium");
		preparedStatement.setInt(3, 130);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "Kingfisher Strong");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Kingfisher Ultra");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "Budweiser");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "Heineken");
		preparedStatement.setInt(3, 150);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "Corona");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "Tuborg");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "Carlsberg");
		preparedStatement.setInt(3,160);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Hunter");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "Knock Out");
		preparedStatement.setInt(3, 120);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Ub Eport");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Original Bira");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Black Fort");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "7 Rivers");
		preparedStatement.setInt(3, 130);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into book_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

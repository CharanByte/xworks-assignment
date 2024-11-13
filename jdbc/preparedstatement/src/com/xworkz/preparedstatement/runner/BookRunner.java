package com.xworkz.preparedstatement.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.preparedstatement.constants.ConnectionEnum;

public class BookRunner {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into book_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "R.K. Narayan");
		preparedStatement.setInt(3, 1943);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "Arundhati Roy");
		preparedStatement.setInt(3, 1997);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "Jhumpa Lahiri");
		preparedStatement.setInt(3, 1990);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Vikram Seth");
		preparedStatement.setInt(3, 1998);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "Salman Rushdie");
		preparedStatement.setInt(3, 1999);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "Anita Desai");
		preparedStatement.setInt(3, 1949);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "Ruskin Bond");
		preparedStatement.setInt(3, 1965);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "Kiran Desai");
		preparedStatement.setInt(3, 1957);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "Ruskin Bond");
		preparedStatement.setInt(3, 1974);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Khushwant Singh");
		preparedStatement.setInt(3, 1980);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "Man Booke");
		preparedStatement.setInt(3, 1995);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Rohinton Mistry");
		preparedStatement.setInt(3, 1992);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Shashi Tharoor");
		preparedStatement.setInt(3, 1991);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Chetan Bhagat");
		preparedStatement.setInt(3, 2007);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "Kamala Markandaya");
		preparedStatement.setInt(3, 2001);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into book_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

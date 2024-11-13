package com.xworkz.facebookapp.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.facebookapp.constants.FaceBookconnection;
import com.xworkz.facebookapp.query.FaceBookInsertQuery;
import com.xworkz.facebookapp.readoperations.*;

public class FaceBookRunner {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(FaceBookconnection.URL.getValue(),
					FaceBookconnection.USERNAME.getValue(), FaceBookconnection.PASSWORD.getValue());
			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate(new FaceBookInsertQuery().getInsertQuery());
//			if (result > 0)
//				System.out.println("Saved into Database");
//			else
//				System.err.println("Not saved into Database");

			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("name"));
			}
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("name"));
			}
			System.out.println("###############################");

			ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("address"));
			}

			System.out.println("###############################");

			ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("email"));
				System.out.println(resultSet4.getString("password"));
			}
			System.out.println("###############################");

			ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("email"));
				System.out.println(resultSet5.getString("password"));

			}

			System.out.println("###############################");

			ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("name"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}

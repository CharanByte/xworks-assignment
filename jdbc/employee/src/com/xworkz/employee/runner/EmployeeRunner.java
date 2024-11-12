package com.xworkz.employee.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.employee.constants.ConnectionConst;
import com.xworkz.employee.query.EmployeeInsert;
import com.xworkz.employee.readoperations.SelectQuery1;
import com.xworkz.employee.readoperations.SelectQuery2;
import com.xworkz.employee.readoperations.SelectQuery3;
import com.xworkz.employee.readoperations.SelectQuery4;
import com.xworkz.employee.readoperations.SelectQuery5;
import com.xworkz.employee.readoperations.SelectQuery6;

public class EmployeeRunner {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			
//			int result = statement.executeUpdate(new EmployeeInsert().getInsertQuery());
//			if (result > 0)
//				System.out.println("Saved into Database");
//			else
//				System.err.println("Not saved into Database");

			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("first_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("first_name"));
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
				System.out.println(resultSet6.getString("first_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

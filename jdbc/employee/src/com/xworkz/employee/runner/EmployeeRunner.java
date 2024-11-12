package com.xworkz.employee.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRunner {

	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/employees_db";
	String userName="root";
	String password="charan";
	String insertQuery="INSERT INTO employees VALUES(1, 'charan', 'Reddy', 'charan.reddy@example.com', 'Reddy',9876543210, '2024-01-01', 101, 55000.00, 28, '123 MG Road, Mumbai, MH', '1996-02-15 08:30:00', 'M'),"+
			"(2, 'Abhi', 'Sharma', 'Abhi.sharma@example.com','Sharma', 9876543211, '2024-02-01', 102, 60000.00, 32, '456 Park Street, Kolkata, WB', '1992-03-20 10:00:00', 'M'),"+
			"(3, 'yuvraj', 'Singh', 'yuvraj.singh@example.com','Singh', 9876543212, '2024-03-01', 103, 62000.00, 29, '789 Nehru Nagar, Chennai, TN', '1995-04-25 09:45:00', 'F'),"+
			"(4, 'pavan', 'Kumar', 'pavan.kumar@example.com','Kumar', 9876543213, '2024-04-01', 104, 58000.00, 30, '321 Brigade Road, Bengaluru, KA', '1993-05-10 14:30:00', 'M'),"+
			"(5, 'likith', 'Reddys', 'ishaan.reddy@example.com','Reddys', 9876543214, '2024-05-01', 105, 54000.00, 31, '654 Ring Road, Hyderabad, TG', '1992-06-15 11:15:00', 'M'),"+
			"(6, 'Aniket', 'Nair', 'aniket.nair@example.com','Nair', 9876543215, '2024-06-01', 106, 50000.00, 27, '987 MG Road, Pune, MH', '1997-07-20 12:00:00', 'F'),"+
			"(7, 'Vivaan', 'Mishra', 'vivaan.mishra@example.com','Mishra', 9876543216, '2024-07-01', 107, 53000.00, 29, '159 MG Road, Ahmedabad, GJ', '1995-08-25 16:45:00', 'M'),"+
			"(8, 'Sara', 'Ghosh', 'sara.ghosh@example.com', 'Ghosh',9876543217, '2024-08-01', 108, 61000.00, 30, '753 MG Road, Indore, MP', '1993-09-30 15:30:00', 'F'),"+
			"(9, 'Arjun', 'Das', 'arjun.das@example.com', 'Das',9876543218, '2024-09-01', 109, 59000.00, 28, '852 Park Street, Nagpur, MH', '1996-10-05 10:15:00', 'M'),"+
			"(10, 'Riya', 'Mehta', 'riya.mehta@example.com','Mehta', 9876543219, '2024-10-01', 110, 52000.00, 31, '951 Brigade Road, Jaipur, RJ', '1992-11-10 08:00:00', 'F'),"+
			"(11, 'Aditya', 'Chauhan', 'aditya.chauhan@example.com','Chauhan' ,9876543220, '2024-11-01', 111, 55000.00, 30, '753 MG Road, Lucknow, UP', '1993-12-15 13:45:00', 'M'),"+
			"(12, 'ananya', 'Pandey', 'kavya.pandey@example.com', 'Pandey',9876543221, '2024-12-01', 112, 54000.00, 27, '852 Nehru Nagar, Patna, BR', '1997-01-20 11:30:00', 'F'),"+
			"(13, 'Dev', 'Joshi', 'dev.joshi@example.com','Joshi', 9876543222, '2024-01-15', 113, 60000.00, 29, '951 Ring Road, Bhopal, MP', '1995-02-25 14:15:00', 'M'),"+
			"(14, 'manasa', 'Bhat', 'manasa.bhat@example.com','Bhat', 9876543223, '2024-02-15', 114, 58000.00, 28, '123 Brigade Road, Kanpur, UP', '1996-03-30 10:45:00', 'F'),"+
			"(15, 'suraj', 'Yadav', 'suraj.yadav@example.com', 'Yadav',9876543224, '2024-03-15', 115, 57000.00, 31, '456 Nehru Nagar, Surat, GJ', '1993-04-05 09:00:00', 'M'),"+
			"(16, 'Ananya', 'Raj', 'ananya.raj@example.com','Raj', 9876543225, '2024-04-15', 116, 62000.00, 30, '789 MG Road, Varanasi, UP', '1993-05-10 12:30:00', 'F'),"+
			"(17, 'Raghav', 'Verma', 'raghav.verma@example.com', 'Verma',9876543226, '2024-05-15', 117, 61000.00, 32, '321 Ring Road, Thane, MH', '1992-06-15 08:45:00', 'M'),"+
			"(18, 'jay', 'Shah', 'jay.shah@example.com', 'Shah',9876543227, '2024-06-15', 118, 53000.00, 27, '654 Brigade Road, Ludhiana, PB', '1997-07-20 14:00:00', 'F'),"+
			"(19, 'kajal', 'Aggarwal', 'kajal.aggarwal@example.com','Aggarwal' ,9876543228, '2024-07-15', 119, 59000.00, 29, '987 Park Street, Agra, UP', '1995-08-25 11:45:00', 'M'),"+
			"(20, 'janvi', 'Kapoor', 'janvi.kapoor@example.com', '',9876543229, '2024-08-15', 120, 56000.00, 30, '159 MG Road, Faridabad, HR', '1993-09-30 13:15:00', 'F')";
			
	
	String selectQuery = "select first_name from employees where email='kajal.aggarwal@example.com' and password='Aggarwal';";
	String selectQuery1 = "select address from employees where first_name='charan' and phone_number='9876543210';";
	String selectQuery2 = "select email,password from employees where phone_number='9876543228';";
	String selectQuery3 = "select email,password from employees where phone_number='9876543225' and first_name='Ananya';";
	String selectQuery4 = "select first_name from employees where id>10";

	Connection connection = null;
	try {
		connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
//		int result=statement.executeUpdate(insertQuery);
//		if(result>0)
//			System.out.println("Saved into Database");
//		else
//			System.err.println("Not saved into Database");

		ResultSet resultSet = statement.executeQuery(selectQuery);
		while (resultSet.next()) {
			System.out.println(resultSet.getString("first_name"));
		} 
		System.out.println("###############################");

		ResultSet resultSet1 = statement.executeQuery(selectQuery1);
		if (resultSet1.next()) {
			System.out.println(resultSet1.getString("address"));
		} else
			System.err.println("Not Found");

		System.out.println("###############################");

		ResultSet resultSet2 = statement.executeQuery(selectQuery2);
		while (resultSet2.next()) {
			System.out.println(resultSet2.getString("email"));
			System.out.println(resultSet2.getString("password"));
		}
		System.out.println("###############################");

		ResultSet resultSet3 = statement.executeQuery(selectQuery3);
		while (resultSet3.next()) {
			System.out.println(resultSet3.getString("email"));
			System.out.println(resultSet3.getString("password"));

		} 

		System.out.println("###############################");

		ResultSet resultSet4 = statement.executeQuery(selectQuery4);
		while (resultSet4.next()) {
			System.out.println(resultSet4.getString("first_name"));
		} 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

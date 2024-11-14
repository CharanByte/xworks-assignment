package com.xworkz.hostel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.hostel.constants.HostelConnection;
import com.xworkz.hostel.dto.HostelDTO;

public class HostelRunner {

	public static void main(String[] args) {

		Connection connection=null;
		HostelDTO hostelDTO1=new HostelDTO(1, "Amit", "amit@gamil.com", "Amit", "123 MG Road, Bangalore, Karnataka", "9876543210", 101, "2023-01-10", "2023-12-31", 50000);
		HostelDTO hostelDTO2=new HostelDTO(2, "Priya", "Priya@gamil.com", "Priya", "456 MG Road, Chennai, Tamil Nadu", "8765432109", 102, "2023-02-15", "2024-01-14", 52000);
		HostelDTO hostelDTO3=new HostelDTO(3, "Rahul", "Rahul@gamil.com", "Rahul", "123 MG Road, Bangalore, Karnataka", "7654321098", 103, "2023-01-10", "2023-12-31", 53000);
		HostelDTO hostelDTO4=new HostelDTO(4, "Anjali", "Anjali", "Amit", "101 Residency Road, Kochi, Kerala", "6543210987", 104, "2023-04-25", "2024-03-24", 56000);
		HostelDTO hostelDTO5=new HostelDTO(5, "Vikas", "Vikas.sharma@example.in", "Vikas", "202 MG Road, Hyderabad, Telangana", "5432109876", 105, "2023-05-30", "2024-04-29", 58000);
		HostelDTO hostelDTO6=new HostelDTO(6, "Neha", "Neha.sharma@example.in", "Neha", "303 Commercial Street, Pune, Maharashtra'", "4321098765", 106, "2024-01-10", "2023-1-31", 60000);
		HostelDTO hostelDTO7=new HostelDTO(7, "Suresh Kumar", "suresh.kumar@example.in", "sureshpass", "404 Brigade Road, Jaipur, Rajasthan", "3210987654", 107, "2023-07-20", "2024-06-19", 62000);
		HostelDTO hostelDTO8=new HostelDTO(8, "Meera Iyer", "meera.iyer@example.in", "meerapass", "505 MG Road, Ahmedabad, Gujarat", "2109876543", 108, "2024-08-25", "2024-07-24", 64000);
		HostelDTO hostelDTO9=new HostelDTO(9, "Rajesh Gupta", "rajesh.gupta@example.in", "rajeshpass", "606 Residency Road, Indore, Madhya Pradesh", "1098765432", 109, "2023-09-30", "2024-08-29", 66000);
		HostelDTO hostelDTO10=new HostelDTO(10, "Sneha Joshi","sneha.joshi@example.in", "snehapass", "707 MG Road, Kolkata, West Bengal", "0987654321", 110, "2023-10-05", "2024-09-04", 68000);
				
		HostelDTO [] dtos= {hostelDTO1,hostelDTO2,hostelDTO3,hostelDTO4,hostelDTO5,hostelDTO6,hostelDTO7,hostelDTO8,hostelDTO9,hostelDTO10};
		try {
			connection=DriverManager.getConnection(HostelConnection.URL.getValue(),HostelConnection.USERNAME.getValue(),HostelConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement=connection.prepareStatement("insert into hostel_table values(?,?,?,?,?,?,?,?,?,?)");
		
			for(HostelDTO ref:dtos) {
				preparedStatement.setInt(1, ref.getId());
				preparedStatement.setString(2, ref.getName());
				preparedStatement.setString(3,ref.getEmail());
				preparedStatement.setString(4, ref.getPassword());
				preparedStatement.setString(5, ref.getAddress());
				preparedStatement.setString(6, ref.getPhoneNo());
				preparedStatement.setInt(7, ref.getRoomNumber());
				preparedStatement.setString(8, ref.getCheckInDate());
				preparedStatement.setString(9, ref.getCheckOutDate());
				preparedStatement.setInt(10, ref.getFeesPaid());
				preparedStatement.addBatch();
	
			}
			
			int[] rowInserted=preparedStatement.executeBatch();
			
			System.out.println(rowInserted.length+" added values into hostel_table");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

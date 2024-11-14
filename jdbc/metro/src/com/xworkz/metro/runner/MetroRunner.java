package com.xworkz.metro.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.metro.constants.MetroConnection;
import com.xworkz.metro.dto.MetroDTO;



public class MetroRunner {

	public static void main(String[] args) {
		
			Connection connection=null;
			MetroDTO metroDTO1 = new MetroDTO(1, "Amit Sharma", "amit.sharma@example.in", "password123", "123 MG Road, Bangalore, Karnataka", "9876543210", "T12345", "2023-01-10", "Majestic", "Whitefield");
			MetroDTO metroDTO2 = new MetroDTO(2, "Priya Singh", "priya.singh@example.in", "securepass", "456 MG Road, Chennai, Tamil Nadu", "8765432109", "T12346", "2023-02-15", "Central", "Guindy");
			MetroDTO metroDTO3 = new MetroDTO(3, "Rahul Verma", "rahul.verma@example.in", "rahulpass", "789 Brigade Road, Mumbai, Maharashtra", "7654321098", "T12347", "2023-03-20", "Andheri", "Borivali");
			MetroDTO metroDTO4 = new MetroDTO(4, "Anjali Nair", "anjali.nair@example.in", "anjalipass", "101 Residency Road, Kochi, Kerala", "6543210987", "T12348", "2023-04-25", "Ernakulam South", "Aluva");
			MetroDTO metroDTO5 = new MetroDTO(5, "Vikas Reddy", "vikas.reddy@example.in", "vikaspass", "202 MG Road, Hyderabad, Telangana", "5432109876", "T12349", "2023-05-30", "Ameerpet", "Miyapur");
			MetroDTO metroDTO6 = new MetroDTO(6, "Neha Kapoor", "neha.kapoor@example.in", "nehapass", "303 Commercial Street, Pune, Maharashtra", "4321098765", "T12350", "2023-06-15", "Shivajinagar", "Hinjewadi");
			MetroDTO metroDTO7 = new MetroDTO(7, "Suresh Kumar", "suresh.kumar@example.in", "sureshpass", "404 Brigade Road, Jaipur, Rajasthan", "3210987654", "T12351", "2023-07-20", "Mansarovar", "Chandpole");
			MetroDTO metroDTO8 = new MetroDTO(8, "Meera Iyer", "meera.iyer@example.in", "meerapass", "505 MG Road, Ahmedabad, Gujarat", "2109876543", "T12352", "2023-08-25", "Kalupur", "Gandhinagar");
			MetroDTO metroDTO9 = new MetroDTO(9, "Rajesh Gupta", "rajesh.gupta@example.in", "rajeshpass", "606 Residency Road, Indore, Madhya Pradesh", "1098765432", "T12353", "2023-09-30", "Vijay Nagar", "Rajwada");
			MetroDTO metroDTO10 = new MetroDTO(10, "Sneha Joshi", "sneha.joshi@example.in", "snehapass", "707 MG Road, Kolkata, West Bengal", "0987654321", "T12354", "2023-10-05", "Esplanade", "Dumdum");

					
			MetroDTO [] dtos= {metroDTO1,metroDTO2,metroDTO3,metroDTO4,metroDTO5,metroDTO6,metroDTO7,metroDTO8,metroDTO9,metroDTO10};
			try {
				connection=DriverManager.getConnection(MetroConnection.URL.getValue(),MetroConnection.USERNAME.getValue(),MetroConnection.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement("insert into metro_table values(?,?,?,?,?,?,?,?,?,?)");
			
				for(MetroDTO ref:dtos) {
					preparedStatement.setInt(1, ref.getId());
					preparedStatement.setString(2, ref.getName());
					preparedStatement.setString(3,ref.getEmail());
					preparedStatement.setString(4, ref.getPassword());
					preparedStatement.setString(5, ref.getAddress());
					preparedStatement.setString(6, ref.getPhone_number());
					preparedStatement.setString(7, ref.getTicket_number());
					preparedStatement.setString(8, ref.getJourney_date());
					preparedStatement.setString(9, ref.getDeparture_station());
					preparedStatement.setString(10, ref.getArrival_station());
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

package com.xworkz.institute.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.institute.constants.InstituteConnection;
import com.xworkz.institute.dto.InstituteDTO;

public class InstituteRepositoryImp implements InstituteRepository{

	@Override
	public boolean save(InstituteDTO instituteDTO) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(InstituteConnection.URL.getValue(),InstituteConnection.USERNAME.getValue(),InstituteConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into institue_table values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, instituteDTO.getId());
		preparedStatement.setString(2, instituteDTO.getName());
		preparedStatement.setString(3, instituteDTO.getEmail());
		preparedStatement.setString(4, instituteDTO.getPassword());
		preparedStatement.setLong(5, instituteDTO.getNumber());
		preparedStatement.setInt(6, instituteDTO.getAge());
		preparedStatement.setString(7, instituteDTO.getAddress());
		
		
		
		int value=preparedStatement.executeUpdate();
		if(value>0) {
			System.out.println("saved into database");
		}
		else
			System.err.println("not saved into database");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}

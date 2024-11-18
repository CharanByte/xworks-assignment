package com.xworkz.studentform.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.studentform.constants.StudentConnection;
import com.xworkz.studentform.dto.StudentDTO;

public class StudentRepositoryImp implements StudentRepository {

	@Override
	public boolean save(StudentDTO studentDTO) {

		boolean saved = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(StudentConnection.URL.getValue(),
					StudentConnection.USERNAME.getValue(), StudentConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into student_table values(?,?,?,?,?,?)");
			preparedStatement.setString(1, studentDTO.getFirstName());
			preparedStatement.setString(2, studentDTO.getLastName());
			preparedStatement.setString(3, studentDTO.getEmail());
			preparedStatement.setLong(4, studentDTO.getPhoneNo());
			preparedStatement.setInt(5, studentDTO.getAge());
			preparedStatement.setString(6, studentDTO.getAddress());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved into db");
			} else {
				saved = false;
				System.err.println("not saved into db");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saved;
	}

}

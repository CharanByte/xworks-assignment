package com.xworkz.signin.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.signin.constants.SignInConnection;
import com.xworkz.signin.dto.SignInDTO;

public class SignInRepositoryImp implements SignInRepository {

	@Override
	public boolean save(SignInDTO signInDTO) {
		boolean saved = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(SignInConnection.URL.getValue(),
					SignInConnection.USERNAME.getValue(), SignInConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into signin_table values(?,?)");

			preparedStatement.setString(1, signInDTO.getUserName());
			preparedStatement.setString(2, signInDTO.getPassword());
			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved");
			} else {
				saved = false;
				System.err.println("not saved");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return saved;
	}

}

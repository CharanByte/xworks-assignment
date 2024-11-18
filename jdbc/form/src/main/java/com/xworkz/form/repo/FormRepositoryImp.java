package com.xworkz.form.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.form.constants.FormConnection;
import com.xworkz.form.dto.FormDTO;

public class FormRepositoryImp implements FormRepository {

	@Override
	public boolean save(FormDTO formDTO) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(), FormConnection.USERNAME.getValue(),
					FormConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into form_table values(?,?,?,?)");

			preparedStatement.setString(1, formDTO.getName());
			preparedStatement.setString(2, formDTO.getEmail());
			preparedStatement.setInt(3, formDTO.getAge());
			preparedStatement.setLong(4, formDTO.getMobileNo());
			int value = preparedStatement.executeUpdate();
			if (value > 1) {
				System.out.println("saved into database");
			} else
				System.out.println("not saved into database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

package com.xworkz.institute.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import com.xworkz.institute.constants.InstituteConnection;
import com.xworkz.institute.dto.InstituteDTO;

public class InstituteRepositoryImp implements InstituteRepository {

	@Override
	public boolean save(InstituteDTO instituteDTO) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(InstituteConnection.URL.getValue(),
					InstituteConnection.USERNAME.getValue(), InstituteConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into institue_table values(?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, instituteDTO.getId());
			preparedStatement.setString(2, instituteDTO.getName());
			preparedStatement.setString(3, instituteDTO.getEmail());
			preparedStatement.setString(4, instituteDTO.getPassword());
			preparedStatement.setLong(5, instituteDTO.getNumber());
			preparedStatement.setInt(6, instituteDTO.getAge());
			preparedStatement.setString(7, instituteDTO.getAddress());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved into database");
			} else
				System.err.println("not saved into database");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public String getNameByPhone(String Phone) {
		String ref = null;
		String ref1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(InstituteConnection.URL.getValue(),
					InstituteConnection.USERNAME.getValue(), InstituteConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("select name,email from institue_table where number=?");
			preparedStatement.setString(1, Phone);
			ResultSet resultSet1 = preparedStatement.executeQuery();

			while (resultSet1.next()) {
				ref = resultSet1.getString("name");
				ref1 = resultSet1.getString("email");
				System.out.println(ref);
				System.out.println(ref1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref + " and " + ref1;

	}

	public int deleteDataById(int id) {
		int ref = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(InstituteConnection.URL.getValue(),
					InstituteConnection.USERNAME.getValue(), InstituteConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("delete from institue_table where id=?");
			preparedStatement.setInt(1, id);
			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				ref = 1;
			} else {
				ref = 0;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;

	}

	public String updateByEmail(String email) {
		String ref = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(InstituteConnection.URL.getValue(),
					InstituteConnection.USERNAME.getValue(), InstituteConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("update institue_table set address='kolar' where email=?");
			preparedStatement.setString(1, email);
			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				ref = " address updated";
			} else {
				ref = " address not updated ";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;

	}

	public String getListById(int id) {
		String ref = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(InstituteConnection.URL.getValue(),
					InstituteConnection.USERNAME.getValue(), InstituteConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from institue_table where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String name = resultSet.getString("name");
				String number = resultSet.getString("number");
				int age = resultSet.getInt("age");
				String address = resultSet.getString("address");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");

				ref = "InstituteDTO [name=" + name + ", email=" + email + ", password=" + password + ", number="
						+ number + ", age=" + age + ", address=" + address + ", id=" + id + "]";

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;

	}

}

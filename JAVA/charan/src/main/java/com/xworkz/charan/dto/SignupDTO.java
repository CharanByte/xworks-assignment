package com.xworkz.charan.dto;

import java.io.Serializable;

public class SignupDTO implements Serializable{
	
	private String userName;
	private String email;
	private String password;
	private String conformPassword;
	public SignupDTO() {
		super();
	}
	public SignupDTO(String userName, String email, String password, String conformPassword) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.conformPassword = conformPassword;
	}
	@Override
	public String toString() {
		return "SignupDTO [userName=" + userName + ", email=" + email + ", password=" + password + ", conformPassword="
				+ conformPassword + "]";
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conformPassword == null) ? 0 : conformPassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignupDTO other = (SignupDTO) obj;
		if (conformPassword == null) {
			if (other.conformPassword != null)
				return false;
		} else if (!conformPassword.equals(other.conformPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	

}

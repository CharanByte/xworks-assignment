package com.xworkz.signin.constants;

public enum SignInConnection {


	URL("jdbc:mysql://localhost:3306/signin_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private SignInConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

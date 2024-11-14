package com.xworkz.metro.constants;

public enum MetroConnection {

	URL("jdbc:mysql://localhost:3306/metro_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private MetroConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

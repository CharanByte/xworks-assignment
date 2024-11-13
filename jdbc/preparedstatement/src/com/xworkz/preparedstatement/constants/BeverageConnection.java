package com.xworkz.preparedstatement.constants;

public enum BeverageConnection {

	URL("jdbc:mysql://localhost:3306/beverage_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private BeverageConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

package com.xworkz.books.constants;

public enum ConnectionEnum {

	URL("jdbc:mysql://localhost:3306/book_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private ConnectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}

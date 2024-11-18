package com.xworkz.studentform.constants;

public enum StudentConnection {
	
	URL("jdbc:mysql://localhost:3306/student_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private StudentConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}

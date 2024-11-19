package com.xworkz.institute.constants;

public enum InstituteConnection {
	
	URL("jdbc:mysql://localhost:3306/institute_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private InstituteConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

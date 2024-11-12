package com.xworkz.employee.constants;

public enum ConnectionConst {
	URL("jdbc:mysql://localhost:3306/employees_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

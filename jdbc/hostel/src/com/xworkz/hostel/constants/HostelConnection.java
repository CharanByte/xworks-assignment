package com.xworkz.hostel.constants;

public enum HostelConnection {
	
	URL("jdbc:mysql://localhost:3306/hostel_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private HostelConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

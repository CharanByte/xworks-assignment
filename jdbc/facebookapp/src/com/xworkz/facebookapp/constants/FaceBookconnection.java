package com.xworkz.facebookapp.constants;

public enum FaceBookconnection {
	URL("jdbc:mysql://localhost:3306/facebook_app_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private FaceBookconnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

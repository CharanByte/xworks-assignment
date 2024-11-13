package com.xworkz.preparedstatement.constants;

public enum TrainConnection {

	URL("jdbc:mysql://localhost:3306/train_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private TrainConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

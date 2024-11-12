package com.xworkz.product.constants;

public enum ConnectionConst {

	URL("jdbc:mysql://localhost:3306/products_db"), USERNAME("root"), PASSWORD("charan");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

package com.xworkz.dto;

import com.xworkz.internal.ProductType;

public class CustomerDTO {
	private String name;
	private String email;
	private ProductType prodoctType;
	
	public CustomerDTO(String name, String email, ProductType prodoctType) {
		super();
		this.name = name;
		this.email = email;
		this.prodoctType = prodoctType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ProductType getProdoctType() {
		return prodoctType;
	}

	public void setProdoctType(ProductType prodoctType) {
		this.prodoctType = prodoctType;
	}
	
	

}

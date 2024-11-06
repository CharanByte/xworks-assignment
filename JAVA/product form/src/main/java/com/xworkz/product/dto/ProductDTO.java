package com.xworkz.product.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable{
	private String companyName;
	private String productName;
	private String productType;
	private int productQuantiy;
	private double productCost;
	public ProductDTO() {
		super();
	}
	public ProductDTO(String companyName, String productName, String productType, int productQuantiy,
			double productCost) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.productType = productType;
		this.productQuantiy = productQuantiy;
		this.productCost = productCost;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductType() {
		return productType;
	}
	public int getProductQuantiy() {
		return productQuantiy;
	}
	public double getProductCost() {
		return productCost;
	}
	@Override
	public String toString() {
		return "PoductDTO [companyName=" + companyName + ", productName=" + productName + ", productType=" + productType
				+ ", productQuantiy=" + productQuantiy + ", productCost=" + productCost + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productQuantiy;
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (Double.doubleToLongBits(productCost) != Double.doubleToLongBits(other.productCost))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productQuantiy != other.productQuantiy)
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		return true;
	}
	
	
}

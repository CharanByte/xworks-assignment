package com.xworkz.dto.productdto;

import java.io.Serializable;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
	private int id;
	private String name;
	private String vendor;
	private double cost;
	public ProductDTO() {
		super();
	}
	public ProductDTO(int id, String name, String vendor, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getVendor() {
		return vendor;
	}
	public double getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", vendor=" + vendor + ", cost=" + cost + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
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
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		return true;
	}
	
	public int compareTo(ProductDTO o) {
		return Double.compare(this.cost, o.cost);
	}

}

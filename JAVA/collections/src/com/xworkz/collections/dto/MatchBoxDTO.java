package com.xworkz.collections.dto;

import java.io.Serializable;

public class MatchBoxDTO implements Serializable{
	private double cost;
	private  String brand;
	
	public MatchBoxDTO() {
		super();
	}

	public MatchBoxDTO(double cost, String brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "MatchBox [cost=" + cost + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MatchBoxDTO other = (MatchBoxDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		return true;
	}
	
	
	
	
}

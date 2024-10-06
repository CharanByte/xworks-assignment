package com.xworkz.collections.dto;

import java.io.Serializable;

import com.xworkz.collections.constants.*;



public class CountryDTO implements Serializable{
	private String  name,presidentName;
	private long population;
	private CountryCode code;
	private Continent continent;
	
	public CountryDTO() {
		super();
	}

    public CountryDTO(String name, CountryCode code, long population, String presidentName, Continent continent) {
		super();
		this.name = name;
		this.presidentName = presidentName;
		this.population = population;
		this.code = code;
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public double getPopulation() {
		return population;
	}

	public CountryCode getCode() {
		return code;
	}

	public Continent getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", presidentName=" + presidentName + ", population=" + population
				+ ", code=" + code + ", continent=" + continent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (code != other.code)
			return false;
		if (continent != other.continent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}
	
	
	
	
	

}

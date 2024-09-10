package com.xworkz.casting.internal;

public class Country {
	private String name;
    private String capital;
    private long population;
    private double area;
    private int noOfstates;
    private String currency;
	public Country(String name, String capital, long population, double area, int noOfstates, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.area = area;
		this.noOfstates = noOfstates;
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Country) {
				Country casted =(Country)obj;
				if(this.population==casted.population && this.area==casted.area && this.noOfstates==casted.noOfstates) {
					return true;
				}
			}
		}
		return false;
	}

}

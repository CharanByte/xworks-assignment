package com.xworkz.casting.internal;

public class State {
	private String name;
    private String capital;
    private long population;
    private double area;
    private int districts;
    private String currency;
	public State(String name, String capital, long population, double area, int districts, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.area = area;
		this.districts = districts;
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof State) {
				State casted =(State)obj;
				if(this.population==casted.population && this.area==casted.area && this.districts==casted.districts) {
					return true;
				}
			}
		}
		return false;
	}

}



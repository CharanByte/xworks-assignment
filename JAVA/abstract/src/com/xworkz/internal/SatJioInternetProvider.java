package com.xworkz.internal;

import java.time.LocalDate;

public class SatJioInternetProvider extends JioInternetProvider {
	
	private double cost;
	private LocalDate launchDate;

	
	public SatJioInternetProvider(String name,String ceo,double cost ,LocalDate localDate) {
		super(name,ceo);
		this.cost=cost;
		this.launchDate=localDate;
		System.out.println("created two arg const in SatJioInternetProvider");
		// TODO Auto-generated constructor stub
	}
	
		
	@Override
	public void service() {
		System.out.println("running service in SatJioInternetProvider ");
	}


	@Override
	public String toString() {
		return "SatJioInternetProvider [cost=" + cost + ", launchDate=" + launchDate + "]";
	}
	

}

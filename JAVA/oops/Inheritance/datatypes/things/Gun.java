package com.xworks.datatypes.things;

public class Gun {
	private String name;
	private String countryMadeBy;
	private String type;
	
	
	public Gun(String name, String countryMadeBy, String type) {
		super();
		this.name = name;
		this.countryMadeBy = countryMadeBy;
		this.type = type;
	}
	
	public void fire() {
		System.out.println("running fire");
	}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("countrymadeBy : "+countryMadeBy);
		System.out.println("type  :"+type);

	}
	

}

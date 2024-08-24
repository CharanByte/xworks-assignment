package com.xworkz.city.store;

public class CityRunner {

	public static void main(String[] args) {
		City city=new City();
		city.store("bengaluru");
		city.store("Hyderabad");
		city.store("delhi");
		city.store("mumbai");
		city.store("chennai");
		city.store("Thiruvananthapuram");
		city.store("Ahmedabad");
		
		city.display();
	

	}

}

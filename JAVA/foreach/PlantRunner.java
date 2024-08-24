package com.xworks.assignment;

public class PlantRunner {
	
	public static void main(String[] args) {
		Plant plant1=new Plant("Hibiscus",40,"kolar",20,0);
		 plant1.setter(20,"none","raju",true);
		 
		 Plant plant2=new Plant("Lemon",40,"srinivaspura",40,30);
		 plant2.setter(40,"green","ramu",true);
		 
		 Plant plant3=new Plant("Jasmine",40,"kgf",40,0);
		 plant3.setter(40,"none","bhema",true);
		 

		Plant[] plantref=new Plant[3] ;
		plantref[0]=plant1;
		plantref[1]=plant2;
		plantref[2]=plant3;
		
		for(Plant ref : plantref) {
			ref.print();
		}
		}

}

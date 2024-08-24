package com.xworkz.dam.store;

public class DamRunner {

	public static void main(String[] args) {
		Dam dam=new Dam();
		dam.store("Nagarjuna Sagar Dam	");
		dam.store("Tungabhadra Dam	");
		dam.store("Mettur Dam	");
		dam.store("Hirakud dam	");
		dam.store("Tehri Dam	");
		dam.store("Bhakra Nangal Dam");
		dam.store("Bhavani Sagar dam");
		
		dam.display();
	}

}

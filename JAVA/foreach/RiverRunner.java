package com.xworkz.river.store;

public class RiverRunner {

	public static void main(String[] args) {
		
		River river=new River();
		river.store("Ganges");
		river.store("Brahmaputra");
		river.store("Cauvery");
		river.store("Yamuna");
		river.store("Indus");
		river.store("Godavari");
		river.store("Narmada");
		
		river.display();

	}

}

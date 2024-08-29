package com.xworks.datatypes.things;

public class Dboss {
	public Gun gun;
	
	public Dboss(Gun gun) {
		this.gun=gun;
	}
	
	public void print() {
		gun.fire();
		gun.display();
	}

}

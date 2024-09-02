package com.xworks.datatypes.things;

public class VgardFan extends Fan {
	
	public  VgardFan() {
		// TODO Auto-generated constructor stub
		super.rotate();
		
	}
	
	@Override
	public void rotate() {
		System.out.println("running rotate in VgardFan");
	}

}

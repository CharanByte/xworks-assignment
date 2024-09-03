package com.xworkz.practise.internal;

public class Gun extends Weapon{
	
	@Override
	protected void use() {
		System.out.println("running use in Gun");
	}
	
	@Override
	public void fire() {
		System.out.println("running fire in Gun");
	}
	
	public void show() {
		this.use();
		this.fire();
	}

}

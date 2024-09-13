package com.xworkz.internal;


public abstract class Provider {
	private String name;
	private String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
		
		System.out.println("created two arg const in Provider");

		
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	public abstract void service();
		
}

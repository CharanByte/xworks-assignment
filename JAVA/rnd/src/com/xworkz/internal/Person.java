package com.xworkz.internal;

public class Person {
	
	private String name;
	private int age;
	private long no;
	private String email;
	public Person(String name, int age, long no,String email) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
		this.email=email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", no=" + no + ", email=" + email + "]";
	}
	
	
	

}

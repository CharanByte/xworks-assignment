package com.xworkz.standards.repo;

public interface AddressRepository {
	boolean save();
	int update();
	void delete();
	String read();
}

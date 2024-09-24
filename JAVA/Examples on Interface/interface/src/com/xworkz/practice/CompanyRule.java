package com.xworkz.practice;

public interface CompanyRule {
	
	void open();
	
	default int noOfEmployes() {
		return 500;
	}

}

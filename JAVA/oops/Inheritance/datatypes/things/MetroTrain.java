package com.xworks.datatypes.things;

public class MetroTrain extends Train {
	
	public MetroTrain(int no, String source, String destination) {
		super(no,source,destination);
		System.out.println("created MetroTrain const with two arr ");
	}
	
	public MetroTrain(int no) {
		super(no);
		System.out.println("created MetroTrain const with one arr ");
	}
	

}

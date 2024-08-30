package com.xworks.datatypes.things;

public class SubUrbanTrain extends Train {
	
	public SubUrbanTrain(int no, String source, String destination) {
		super(no,source,destination);
		
		System.out.println("created MetroTrain const ");
	}
	
	public SubUrbanTrain(int no) {
		super(no);
		System.out.println("created MetroTrain const ");

}
}
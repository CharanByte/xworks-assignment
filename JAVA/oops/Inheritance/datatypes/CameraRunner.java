package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.SonyCamera;

public class CameraRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SonyCamera sonyCamera=new SonyCamera();
		sonyCamera.capture();
		sonyCamera.display();
		
		System.out.println("******************************************");
		SonyCamera sonyCamera1=new SonyCamera("gray",50000.00,1.00);
		sonyCamera1.capture();
		sonyCamera1.display();
		

	}
	

}

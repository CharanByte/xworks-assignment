package com.xworkz.collections.dto;

public class Bmwrunner {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BMW bmw=new BMW();
		
		try {
		bmw.setColor("red");
		}
		catch(Car e) {
			System.out.println("exception occured");
		}
	}

}

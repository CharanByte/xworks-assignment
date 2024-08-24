package com.xworkz.sidedish;

public class SideDishStore {
	
	SideDish[] dish=new SideDish[5];
	int count;
	
	public void store(SideDish data) {
		dish[count++]=data;
	}

	public void display() {
		for(SideDish data : dish) {
			if(data!=null)
				data.show();
			else
				System.out.println("this is null");

		}
	}
}

package com.xworkz.data.store;

import com.xworkz.data.Sandal;

public class Sandalstore {
	
	Sandal[] sandaldata=new Sandal[5];
	int count=0;
	public void store(Sandal data) {
		sandaldata[count++]=data;
	}
	
	public void diaplay() {
		for(Sandal data : sandaldata) {
			if(data!=null)
				data.show();
			else
				System.out.println("this is null");
		}
	}

}

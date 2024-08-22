package com.xworkz.data.store.display;

import com.xworkz.data.Sandal;
import com.xworkz.data.store.Sandalstore;

public class SandalRunner {

	public static void main(String[] args) {
		Sandal sandal=new Sandal("bata",'M',400,"black");
		Sandal sandal1=new Sandal("paragon",'s',300,"red");
		
		Sandalstore sandalstore=new  Sandalstore();
		sandalstore.store(sandal);
		sandalstore.store(sandal1);

		
		sandalstore.diaplay();
	}

}

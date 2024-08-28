package com.xworks.datatypes;
import com.xworks.datatypes.things.*;
public class HatRunner {
	public static void main(String[] args) {
	Upendra upendra=new Upendra();
	upendra.wear();
	
	Yash1 yash=new Yash1();
	Hat hat=new Hat();
	yash.tare(hat);;
	
	Rajkumar raj=new Rajkumar();
	Hat hat2=new Hat();
	hat2.color="red";
	raj.hat=hat2;
	raj.fold();
	}

}

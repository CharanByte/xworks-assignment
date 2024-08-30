package com.xworks.datatypes.things;

public class Train {
   private int no;
   private String source;
   private String destination;
   
   
public Train(int no, String source, String destination) {
	super();
	this.no = no;
	this.source = source;
	this.destination = destination;
}

public Train(int no) {
	super();
	this.no = no;
}

public void display() {
	System.out.println("No : "+no);
	System.out.println("source : "+source);
	System.out.println("destination : "+destination);
}

   
   
}

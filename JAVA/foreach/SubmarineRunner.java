package com.xworks.assignment;

public class SubmarineRunner {
	
	public static void main(String[] args) {
		Submarine submarine1 =new Submarine("Nautilus","black",127,50000,"john");
		submarine1.setter(2020,4,78787398798L,"bengaluru","karnataka","india","tata",130,200,500,30,59,149,139,45,67,50000,"Active",500,20,10,30,"satallite",1200,20,10,3000);

	    Submarine submarine2 =new Submarine("Poseidon","white",157,5000,"lee");
	    submarine2.setter(2023,6,86782583828L,"kolkata","west bengal","india","corgo",120,250,700,41,59,139,139,43,54,60000,"passive",600,17,11,29,"satallite",1300,21,10,4000);

	    Submarine submarine3 =new Submarine("Vortex","gray",161,30000,"mark");
	    submarine3.setter(2011,4,965363398L,"mysuru","karnataka","india","tata",150,178,456,30,59,122,139,45,67,50000,"Active",670,32,10,60,"satallite",1200,30,12,5000);
 
	    Submarine[] sub=new Submarine[3];
	    sub[0]=submarine1;
	    sub[1]=submarine2;
	    sub[2]=submarine3;

	    

	    for(Submarine ref :sub) {
	    	ref.print();
	    }
	  }


}

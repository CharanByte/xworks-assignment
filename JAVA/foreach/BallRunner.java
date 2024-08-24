package com.xworks.assignment;

public class BallRunner {
	
	 public static void main(String[] args) {
	        Ball ball1=new Ball("tennis","small",2,1,"raj",2024,4,"yellow",97387638767L);
	        ball1.setter("kolar", "karnataka", "india", "foxy", true, true);

	        Ball ball2=new Ball("football","large",3,6,"ramu",2024,6,"white",89788378767L);
	        ball2.setter("bengaluru", "karnataka", "india", "nivya", true, true);

	        Ball ball3=new Ball("rubby","medium",5,4,"raju",2024,8,"red",87387638767L);
	        ball3.setter("mysuru", "karnataka", "india", "cosco", true, true);

	        Ball[] ball =new Ball[3];
	        ball[0]=ball1;
	        ball[1]=ball2;
	        ball[2]=ball3;

	        for(Ball ref : ball){
	            ref.print();
	        }
	    }

}

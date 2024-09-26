package com.xworkz.casting.runner;

import com.xworkz.casting.internal.*;

public class Beltrunner {

	public static void main(String[] args) {
		
		Belt belt=new Belt();
	
		Dancer dancer=new Dancer();
		dancer.use(belt);
		
		System.out.println("**************");
		
		Belt leatherBelt=new LeatherBelt();
		dancer.use(leatherBelt);
		
	
		
		
	}

}

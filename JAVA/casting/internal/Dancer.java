package com.xworkz.casting.internal;

public class Dancer {
	
	public void use(Belt belt) {
		
		Belt  belt1=new Belt();
		belt1.tie();
		
		if(belt instanceof LeatherBelt) {
			
			LeatherBelt leatherBelt=(LeatherBelt)belt;
			leatherBelt.clip();
			
			
			
		}
		
		
	}

}

package com.xworkz.internal;

public class SrinivasPg {
	private PGRule pgRule;

	public SrinivasPg(PGRule pgRule) {
		super();
		this.pgRule = pgRule;
	}
	
	public void follow() {
		if(pgRule!=null) {
			System.out.println("pg rule is not null");
			double result=pgRule.costPerMonth(6000);
			if(result==6000)
				System.out.println("pg cost per month is : "+result);
			else
				System.out.println("pg cost is not: "+result);

			boolean res= pgRule.wifi('y');
			if(res) {
				System.out.println("pg wifi is avaliable");
			}
			else
				System.out.println("pg wifi is not avaliable");
						
		}
		else
			System.out.println("pg rule is null");
		
	}

}

package com.xworkz.runner;

import com.xworkz.internal.HalSignal;
import com.xworkz.internal.LuluMal;
import com.xworkz.internal.MallRule;
import com.xworkz.internal.PGRule;
import com.xworkz.internal.PgOwner;
import com.xworkz.internal.Raj;
import com.xworkz.internal.Sachin;
import com.xworkz.internal.SrinivasPg;
import com.xworkz.internal.TrafficRule;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficRule rule=new Raj();
		HalSignal halSignal=new HalSignal(rule);
		halSignal.check();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		MallRule mallRule=new Sachin();
		LuluMal luluMal=new LuluMal();
		luluMal.setMallRule(mallRule);
		luluMal.check();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		PGRule pgRule=new PgOwner();
		SrinivasPg pg=new SrinivasPg(pgRule);
		pg.follow();
		

	}

}

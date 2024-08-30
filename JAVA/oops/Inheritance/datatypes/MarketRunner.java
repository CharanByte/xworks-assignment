package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMarket superMarket=new SuperMarket("akash","kolar",4,"icecream");
		superMarket.display();
		
		Market market=new SuperMarket("sri",2);
		market.display();
		
		OnlineMarket onlineMarket=new OnlineMarket("manu","kgf",1,"veg hotel");
		onlineMarket.display();
		
		Market market1=new OnlineMarket("nandan",3);
		market1.display();

	}

}

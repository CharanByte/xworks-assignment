package com.xworks.market;

public class MarketRunner {

	public static void main(String[] args) {
		Market market =new Market("KR Market","KR PURAM");
		
		MarketStore store =new MarketStore();
		store.store(market);
		
		store.display();

	}

}

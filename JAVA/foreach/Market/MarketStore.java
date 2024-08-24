package com.xworks.market;

public class MarketStore {
	
	Market[] data=new Market[5];
	int count;
	
	public void store(Market data) {
		this.data[count++]=data;
	}
	
	public void display() {
		for(Market data : this.data) {
			if(data!=null)
				data.show();
			else
				System.out.println("this is null");

		}
	}

}

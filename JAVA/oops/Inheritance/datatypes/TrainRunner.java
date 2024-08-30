package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class TrainRunner {
	
	public static void main(String[] args) {
		
		MetroTrain metroTrain=new MetroTrain(101,"bengaluru","mysuru");
		Train train=new MetroTrain(102);
		
		metroTrain.display();
		train.display();
		
		
		SubUrbanTrain subUrbanTrain=new SubUrbanTrain(201,"kolar","kgf");
				subUrbanTrain.display();
		Train train2=new SubUrbanTrain(202);
		train2.display();
		
	}

}

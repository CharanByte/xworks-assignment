package com.xworks.datatypes.runner;

import com.xworks.datatypes.things.*;

public class GovernmentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateGovernment stateGovernment=new StateGovernment("karnataka",225,"H. D. Deve Gowda","H. D. Kumaraswamy");
		stateGovernment.display();
		
		Government government=new StateGovernment("karnataka",225);
		government.display();
		
		CentrlGovernmnet centrlGovernmnet=new CentrlGovernmnet("andhra",220,"YS Jagan Mohan Reddy","Nani");
		stateGovernment.display();
		
		Government government1=new CentrlGovernmnet("telangana",210);
		government1.display();
		
	}

}

package com.xworkz.practice;

import com.xworkz.internal.*;


public class Dog extends Animal{
	//a class can inherit only single class

}

public abstract class Dog implements BankRule,CollegeRule{
	// a class Can implements multiple interfaces
}
public interface Dog extends TempleRule,TrafficRule{
	//interface inherit multiple interface
	
}

public interface Dog extends Animal{
	// interface can not inherit a class:
	
}


//can an interface implements interface

public interface Dog implements HospitalRule{
	// interface can not implements interface
}

public abstract class Dog extends Object implements HospitalRule,TrafficRule{
	//can a class implements interface and inherit class 
}

public abstract class Dog {
	Dog(){
		// we can write a const in abstract class
	}
	Dog(int height){
		// we can over load const in abstract class
	}
}




package com.xworks.inheritance;
import com.xworks.inheritance.type.Bulb;
import com.xworks.inheritance.type.*;
public class InheritanceRunner {

	public static void main(String[] args) {
		
		TubeLight  tubeLight=new TubeLight();
		tubeLight.watts=12;
		tubeLight.print();
		
		 System.out.println("**********************************************");

		Bulb  bulb=new TubeLight();
		bulb.watts=16;
		bulb.print();
		
		 System.out.println("**********************************************");
		
		 Halwa halwa =new Halwa();
		 halwa.color="red";
		 halwa.weight=20;
		 halwa.printColor();
		 halwa.printWeight();
		 
		 System.out.println("**********************************************");
		 
		 Sweet sweet=new Halwa();
		 sweet.color="orange";
		 sweet.weight=40;
		 sweet.printColor();
		 sweet.printWeight();
		 
	
		 System.out.println("**********************************************");
		 
		 SmartPhone smartPhone=new SmartPhone();
		 smartPhone.color="Black";
		 smartPhone.price=25000;
		 smartPhone.storage=128;
		 smartPhone.processor="Qualcomm Snapdragon 8 Gen 3	";
		 smartPhone.name="redmi";
		 smartPhone.printColor();
		 smartPhone.printPrice();
		 smartPhone.printStorage();
		 smartPhone.printProcessor();
		 smartPhone.printName();
		 
		 System.out.println("**********************************************");

		 Phone phone=new SmartPhone();
		 phone.color="red";
		 phone.price=45000;
		 phone.storage=256;
		 phone.processor="MediaTek Dimensity";
		 phone.name="realme";
		 phone.printColor();
		 phone.printPrice();
		 phone.printStorage();
		 phone.printProcessor();
		 phone.printName();
		 
		 System.out.println("**********************************************");
		 
		 Bull bull=new Bull();
		 bull.color="black";
		 bull.weight=400;
		 bull.height=7;
		 bull.breed="Aberdeen Angus";
		 bull.food="grass";
		 bull.printcolor();
		 bull.printheight();
		 bull.printweight();
		 bull.printbreed();
		 bull.printfood();
		 
		 System.out.println("**********************************************");
		 Animal animal=new Bull();
		 animal.color="white";
		 animal.weight=500;
		 animal.height=6.8;
		 animal.breed=" Angus";
		 animal.food="grass";
		 animal.printcolor();
		 animal.printheight();
		 animal.printweight();
		 animal.printbreed();
		 animal.printfood();
		 System.out.println("**********************************************");
		 
		 Chicken chicken =new Chicken();
		 chicken.color="white";
		 chicken.height=1;
		 chicken.weight=2;
		 chicken.food="grains";
		 chicken.breed="Brahma chicken";
		 chicken.fly();
		 chicken.food();
		 chicken.sound();
		 
		 System.out.println("**********************************************");

		 Bird bird =new Chicken();
		 bird.color="red";
		 bird.height=1.1;
		 bird.weight=3;
		 bird.food="grains";
		 bird.breed="Brahma chicken";
		 bird.fly();
		 bird.food();
		 bird.sound();
		 
	}

}

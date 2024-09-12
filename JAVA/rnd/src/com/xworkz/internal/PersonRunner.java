package com.xworkz.internal;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1=new Person("nandan", 24, 98787836876L,"nandan@gmail.com");
		Person person2=new Person("likith", 20, 98787836876L,"liki@gmail.com");
		Person person3=new Person("teju", 21, 98787836876L,"teju@gmail.com");
		Person person4=new Person("naveen", 25, 98787836876L,"naveen@gmail.com");
		Person person5=new Person("raju", 22, 98787836876L,"raju@gmail.com");

		
		Person[] arr= {person1,person2,person3,person4,person5};
		
		for(Person ref :arr) {
			System.out.println(ref);
		}
		


	}

}

package com.xworkz.internal;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now().minusYears(10);
		System.out.println("past date : "+date);
		
		System.out.println("-----------------");
		
		LocalDate date1=LocalDate.now().plusYears(10);
		System.out.println("future date : "+date1);
		System.out.println("-----------------");
		

		LocalDateTime time1=LocalDateTime.now().minusYears(10);
		System.out.println("past datetime : "+time1);
		System.out.println("-----------------");
		
		LocalDateTime time2=LocalDateTime.now().plusYears(10);
		System.out.println("past datetime : "+time2);
		System.out.println("-----------------");


	}

}

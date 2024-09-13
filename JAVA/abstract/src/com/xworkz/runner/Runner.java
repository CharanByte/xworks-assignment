package com.xworkz.runner;

import java.time.LocalDate;

import com.xworkz.internal.BookMyShowMovieBookingProvider;
import com.xworkz.internal.DellProvider;
import com.xworkz.internal.Fast5gExtreme;
import com.xworkz.internal.LenovoProvider;
import com.xworkz.internal.MovieBookingProvider;
import com.xworkz.internal.SatJioInternetProvider;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMyShowMovieBookingProvider provider=new BookMyShowMovieBookingProvider("BSNL", "Pravin Kumar Purwar", 200);
		provider.book();
		provider.cancel();
		provider.service();
		System.out.println(provider);
		
		
		
		System.out.println("+=========================");
		
		DellProvider dellProvider=new DellProvider("dell", "Michael ");
		dellProvider.service();
		System.out.println(dellProvider);
		
		System.out.println("+=========================");

		LenovoProvider lenovoProvider=new LenovoProvider("lenovo", "Yang Yuanqing", 20);
		System.out.println(lenovoProvider);
		lenovoProvider.service();
		
		System.out.println("+=========================");

		Fast5gExtreme fast=new Fast5gExtreme("airtel", "Gopal Vittal ");
		System.out.println(fast);
		
		System.out.println("+=========================");
		LocalDate date=LocalDate.now();
		SatJioInternetProvider sat=new SatJioInternetProvider("jio", "Jayaraman",300,date);
		System.out.println(sat);
	



	}

}

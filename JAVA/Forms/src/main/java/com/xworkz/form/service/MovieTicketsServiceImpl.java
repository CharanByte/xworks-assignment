package com.xworkz.form.service;

import com.xworkz.form.dto.MovieTicketsDTO;

public class MovieTicketsServiceImpl  implements MovieTicketsService{

	@Override
	public boolean validate(MovieTicketsDTO movieTicketsDTO) {
		
		boolean valid=true;

			if(movieTicketsDTO!=null)
			{
				String name = movieTicketsDTO.getName();
				if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
					System.out.println("Given name is valid....");
				} else {
					System.err.println("Given name is invalid");
					valid=false;
				}
				
				int totalTickets = movieTicketsDTO.getTotalTickets();
				if (totalTickets >=1) {
					System.out.println("total Tickets is valid");
				} else {
					System.err.println("total Tickets is invalid");
					valid=false;
				}

				String theaterName = movieTicketsDTO.getTheaterName();
				if (theaterName != null && !theaterName.isEmpty() && theaterName.length() >= 3 && theaterName.length() <= 30) {
					System.out.println("Given Theater name is valid....");
				} else {
					System.err.println("Given Theater name is invalid");
					valid=false;
				}
				
				double donation = movieTicketsDTO.getDonation();
				if (donation>=1) {
					System.out.println("donation is valid");
				} else {
					System.err.println("donation is invalid");
					valid=false;
				}

				String date = movieTicketsDTO.getDate();
				if (date != null && !date.isEmpty()) {
					System.out.println("Given name is valid....");
				} else {
					System.err.println("Given name is invalid");
					valid=false;
				}	
				
				String time = movieTicketsDTO.getName();
				if (time != null && !time.isEmpty()) {
					System.out.println("Given time is valid....");
				} else {
					System.err.println("Given time is invalid");
					valid=false;
				}		
			}
			
			return valid;
	}

}

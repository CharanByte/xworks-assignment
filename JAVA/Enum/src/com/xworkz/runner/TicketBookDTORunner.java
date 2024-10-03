package com.xworkz.runner;

import com.xworkz.dto.TicketBookDTO;
import com.xworkz.internal.*;


public class TicketBookDTORunner {

	public static void main(String[] args) {
		TicketBookDTO bookDTO = new TicketBookDTO("Salaar", "Bhavani", TicketType.OFFLINE, SeatType.EXECUTIVE);
		String movieName = bookDTO.getMovieName();
		String theaterName = bookDTO.getTheaterName();
		TicketType type = bookDTO.getTicketType();
		SeatType seatType = bookDTO.getSeatType();
		int price=type.getPrice();
		String seatNo=seatType.getSeatNo();
		System.out.println("movieName : " + movieName + " theaterName : " + theaterName + " TicketType : " + type
				+ " SeatType : " + seatType);
		System.err.println("Ticketprice : "+price);
		System.err.println("seatNo : "+seatNo);
	}

}

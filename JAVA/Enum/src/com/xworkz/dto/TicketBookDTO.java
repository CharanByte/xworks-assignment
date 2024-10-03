package com.xworkz.dto;

import com.xworkz.internal.*;

public class TicketBookDTO {
	private String movieName;
	private String theaterName;
	private TicketType ticketType;
	private SeatType seatType;
	
	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		super();
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	
	

}

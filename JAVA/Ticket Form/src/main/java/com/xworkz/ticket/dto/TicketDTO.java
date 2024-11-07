package com.xworkz.ticket.dto;

import java.io.Serializable;

public class TicketDTO implements Serializable{
	private String ticketName;
	private int ticketNo;
	private long contact;
	private String email;
	public TicketDTO() {
		super();
	}
	public TicketDTO(String ticketName, int ticketNo, long contact, String email) {
		super();
		this.ticketName = ticketName;
		this.ticketNo = ticketNo;
		this.contact = contact;
		this.email = email;
	}
	public String getTicketName() {
		return ticketName;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public long getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "TicketDTO [ticketName=" + ticketName + ", ticketNo=" + ticketNo + ", contact=" + contact + ", email="
				+ email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((ticketName == null) ? 0 : ticketName.hashCode());
		result = prime * result + ticketNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketDTO other = (TicketDTO) obj;
		if (contact != other.contact)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (ticketName == null) {
			if (other.ticketName != null)
				return false;
		} else if (!ticketName.equals(other.ticketName))
			return false;
		if (ticketNo != other.ticketNo)
			return false;
		return true;
	}
	
	
	
}

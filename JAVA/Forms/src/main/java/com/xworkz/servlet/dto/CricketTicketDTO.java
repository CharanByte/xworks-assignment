package com.xworkz.servlet.dto;

import java.io.Serializable;

public class CricketTicketDTO implements Serializable {

	private String groundName;
	private String customerName;
	private String customerEmail;
	private String seatType;
	private int numberOfTickets;

	public CricketTicketDTO() {
		System.out.println("no arg const of CricketTicketDTO");
	}

	public CricketTicketDTO(String groundName, String customerName, String customerEmail, String seatType,
			int numberOfTickets) {
		super();
		this.groundName = groundName;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.seatType = seatType;
		this.numberOfTickets = numberOfTickets;
	}

	@Override
	public String toString() {
		return "CricketTicketDTO [groundName=" + groundName + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", seatType=" + seatType + ", numberOfTickets=" + numberOfTickets + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((groundName == null) ? 0 : groundName.hashCode());
		result = prime * result + numberOfTickets;
		result = prime * result + ((seatType == null) ? 0 : seatType.hashCode());
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
		CricketTicketDTO other = (CricketTicketDTO) obj;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (groundName == null) {
			if (other.groundName != null)
				return false;
		} else if (!groundName.equals(other.groundName))
			return false;
		if (numberOfTickets != other.numberOfTickets)
			return false;
		if (seatType == null) {
			if (other.seatType != null)
				return false;
		} else if (!seatType.equals(other.seatType))
			return false;
		return true;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	
}
package com.xworkz.internal;

public enum SeatType {
	RECLINER("A20"), PREMIUM("S3"), EXECUTIVE("T2");

	private String seatNo;

	private SeatType(String no) {
		this.seatNo = no;
	}
	
	public String getSeatNo() {
		return seatNo;
	}
}

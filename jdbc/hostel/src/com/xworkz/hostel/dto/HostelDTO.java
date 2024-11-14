package com.xworkz.hostel.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class HostelDTO implements Serializable{
	private int id;
	private String name ;
	private String email;
	private String password;
	private String address;
	private String phoneNo;
	private int roomNumber;
	private String checkInDate;
	private String checkOutDate;
	private int feesPaid;
	

}

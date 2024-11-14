package com.xworkz.metro.dto;

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
public class MetroDTO implements Serializable {

	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String phone_number;
	private String ticket_number;
	private String journey_date;
	private String departure_station;
	private String arrival_station;

}

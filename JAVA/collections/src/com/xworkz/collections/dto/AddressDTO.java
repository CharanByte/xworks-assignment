package com.xworkz.collections.dto;

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
public class AddressDTO {
	private int no;
	private String street;
	private String city;
	private String state;
	private Country1DTO countryDTO;

}

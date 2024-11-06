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
public class PresidentDTO {

	private String name;
	private String primaryWork;
	private int age;
	private AddressDTO addressDTO;
	
}

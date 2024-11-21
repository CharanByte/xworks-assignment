package com.xworkz.institute.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class InstituteDTO implements Serializable{

	
	private String name;
	private String email;
	private String password;
	private long number;
	private int age;
	private String address;
	private int id;

	
}

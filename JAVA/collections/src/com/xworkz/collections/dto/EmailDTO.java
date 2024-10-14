package com.xworkz.collections.dto;

import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class EmailDTO  implements Serializable{
	
	private String from;
	private String to;
	private String subject;
	private String message;
	

}

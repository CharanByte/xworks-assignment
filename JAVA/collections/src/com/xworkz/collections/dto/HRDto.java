package com.xworkz.collections.dto;
import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString


public class HRDto implements Serializable {
	private String name;
	private String qualification;
	private int totalExp;
	private String location;
	
	
}

package com.xworkz.collections.dto;

import java.io.Serializable;

import com.xworkz.collections.constants.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class MallDTO  implements Serializable{
	
    private	int id;
    private String name;
    private Location location;
    private String owner;
    private double landDimension;
    
    
}

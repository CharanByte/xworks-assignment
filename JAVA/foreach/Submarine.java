package com.xworks.assignment;

public class Submarine {
	String name;
	String color;
	double weight;
	double height;
	String manufname;
		int manufYear;
		int manufMonth;
		long manufno;
		String manufcity;
		String manufState;
		String manufCountry;
		String companyName;
	    int waterCapacity;
	    int aircapacity;
	    int storageCapacity;
	    int submarine_beam;
	    int submarine_draft;
	   int  max_speed_surface;
	   int max_speed_submerged;
	    int max_depth;
	int endurance;
	int range;
	String sonar_system ;
	int crew_size;
	int officers;
	int berths;
	int mess_capacity;
	String communication_system;
	int satellite_comms_range;
	int escape_hatch_count;
	int missile_launchers;
	int missile_capacity;

	Submarine(String name,String color,double height,double weight,String manufname){
	    this.name=name;
	    this.color=color;
	    this.height=height;
	    this.weight=weight;
	    this.manufname=manufname;

	}

	public void setter(int manufYear,int manufMonth,long manufno,String manufcity,String manufState,String manufCountry,
	String companyName,int waterCapacity,int aircapacity,int storageCapacity,int submarine_beam,int submarine_draft,
	int  max_speed_surface,int max_speed_submerged,int max_depth,int endurance,int range,String sonar_system,
	int crew_size,int officers,int berths,int mess_capacity,String communication_system,int satellite_comms_range
	,int escape_hatch_count,int missile_launchers,int missile_capacity)
	{
	this.manufYear=manufYear;
	this.manufMonth=manufMonth;
	this.manufno=manufno;
	this.manufcity=manufcity;
	this.manufState=manufState;
	this.manufCountry=manufCountry;
	this.companyName=companyName;
	this.waterCapacity=waterCapacity;
	this.aircapacity=aircapacity;
	this.storageCapacity=storageCapacity;
	this.submarine_beam=submarine_beam;
	this.submarine_draft=submarine_draft;
	this.max_speed_surface=max_speed_surface;
	this.max_speed_submerged=max_speed_submerged;
	this.max_depth=max_depth;
	this.endurance=endurance;
	this.range=range;
	this.sonar_system=sonar_system;
	this.crew_size=crew_size;
	this.officers=officers;
	this.berths=berths;
	this.mess_capacity=mess_capacity;
	this.communication_system=communication_system;
	this.satellite_comms_range=satellite_comms_range;
	this.escape_hatch_count=escape_hatch_count;
	this.missile_launchers=missile_launchers;
	this.missile_capacity=missile_capacity;

	}

	public void print(){
	    System.out.println(name);
	    System.out.println(color);
	    System.out.println(height);
	    System.out.println(weight);
	    System.out.println(manufname);
	    System.out.println(manufYear);
	    System.out.println(manufMonth);
	    System.out.println(manufno);
	    System.out.println(manufcity);
	    System.out.println(manufState);
	    System.out.println(manufCountry);
	    System.out.println(companyName);
	    System.out.println(waterCapacity);
	    System.out.println(aircapacity);
	    System.out.println(storageCapacity);
	    System.out.println(submarine_beam);
	    System.out.println(submarine_draft);
	    System.out.println(max_speed_surface);
	    System.out.println(max_speed_submerged);
	    System.out.println(max_depth);
	    System.out.println(endurance);
	    System.out.println(range);
	    System.out.println(sonar_system);
	    System.out.println(crew_size);
	    System.out.println(officers);
	    System.out.println(berths);
	    System.out.println(mess_capacity);
	    System.out.println(communication_system);
	    System.out.println(satellite_comms_range);
	    System.out.println(escape_hatch_count);
	    System.out.println(missile_capacity);
	    System.out.println(missile_launchers);
	}

}

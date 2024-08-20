package com.xworks.assignment;

public class Ball {
	String type;
	String ballSize;
	double height;
	double weight;
	String manufname;
	int manufYear;
	int manufMonth;
	String color;
	long manufno;
	String manufcity;
	String manufState;
	String manufCountry;
	String companyName;
	boolean isBrakeable;
	boolean isavaliable;
	
	
	Ball(String type,String ballSize,double height,double weight,String manufname,int manufYear,int manufMonth,String color,long manufno){
		this.type=type;
        this.ballSize=ballSize;
        this.height=height;
        this.weight=weight;
        this.manufname=manufname;
        this.manufYear=manufYear;
        this.manufMonth=manufMonth;
        this.color=color;
        this.manufno=manufno;
	}
    public void setter(String manufcity,String manufState,String manufCountry,String companyName,boolean isBrakeable,boolean isavaliable){
        this.manufcity=manufcity;
        this.manufState=manufState;
        this.manufCountry=manufCountry;
        this.companyName=companyName;
        this.isBrakeable=isBrakeable;
        this.isavaliable=isavaliable;


    }

    public void print(){
        System.out.println(type);
        System.out.println(ballSize);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(manufname);
        System.out.println(manufYear);
        System.out.println(manufMonth);
        System.out.println(color);
        System.out.println(manufno);
        System.out.println(manufcity);
        System.out.println(manufState);
        System.out.println(manufCountry);
        System.out.println(companyName);
        System.out.println(isBrakeable);
        System.out.println(isavaliable);

    }


	

}

package com.xworkz.string.runner;

public class Ball {

	public static void main(String[] args) {
	
		String name="vicky";
		String name1="  vicky ball  ";
		
		if(name==name1)
			System.out.println("both are same");
		else
			System.err.println("both are not same");
		
		String ref=new String("pepsi");
		String ref1=new String("pepsi");
		
		if(ref==ref1)
			System.out.println("both are same");
		else
			System.err.println("both are not same");
		
		if(ref.equals(ref1))
			System.out.println("both are same");
		else
			System.err.println("both are not same");
	
		System.out.println(ref.charAt(0));
		System.out.println(ref.isEmpty());
		System.out.println(ref.concat(" Ball"));
		System.out.println(ref.contains("si"));
		System.out.println(ref.endsWith("i"));
		System.out.println(ref.equals(ref1));
		System.out.println(ref.indexOf('s'));
		System.out.println(ref.indexOf("psi"));
		System.out.println(ref.indexOf("p", 1));
		System.out.println(name.toCharArray());
		System.out.println(name.startsWith("vi"));
		System.out.println(name.toString());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(1,3));
		System.out.println(name.substring(2));
		System.out.println(name1);
		System.out.println(name1.trim());
	}

}

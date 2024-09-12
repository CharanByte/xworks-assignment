package com.xworkz.internal;
import java.io.*;
public class Pen {
	
	public static void main(String[] args) {
		String content="Java is a high-level, class-based, object-oriented programming language ";
		
		try(BufferedWriter ref=new BufferedWriter(new FileWriter("input.txt"))){
			ref.write(content);
		}
		catch(IOException a) {
			 a.printStackTrace();
		}
	}

}

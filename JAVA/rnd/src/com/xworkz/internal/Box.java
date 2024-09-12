package com.xworkz.internal;
import java.io.*;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}

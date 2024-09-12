package com.xworkz.internal;
import java.io.*;
public class Details {
	public static void main(String[] args) {
        String name = "charan";
        String email = "charan@gmail.com";
        String mobile = "977673245";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("details.txt"))) {
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Mobile: " + mobile + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}

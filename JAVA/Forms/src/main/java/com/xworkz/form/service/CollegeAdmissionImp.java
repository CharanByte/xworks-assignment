package com.xworkz.form.service;

import com.xworkz.form.dto.CollegeAdmissionDTO;
import com.xworkz.form.servlet.CollegeAdmission;

public class CollegeAdmissionImp implements CollegeAdmissionService {

	@Override
	public boolean validateAndSave(CollegeAdmissionDTO collegeAdmissionDTO) {
		
		boolean valid=true;
	if(collegeAdmissionDTO!=null) {
		
		System.out.println("collegeAdmission is not null");
		String name=collegeAdmissionDTO.getName();
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=30) {
			System.out.println("name is valid");
		}
		else {
			System.err.println("name is invalid");
			valid=false;
		}
		String email=collegeAdmissionDTO.getEmail();
		if(email!=null && !email.isEmpty() && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in")))
			System.out.println("email is valid");
		else {
			System.err.println("email  is invalid");
			valid=false;
		}
			
		String mobile = String.valueOf(collegeAdmissionDTO.getMobile());
		if (mobile != null && !mobile.isEmpty() && mobile.length() >= 10 && mobile.length() < 11) {
			System.out.println("valid Mobile Number");
		} else {
			System.err.println("Invalid Mobile Number");
			valid = false;
		}

		String address = collegeAdmissionDTO.getAddress();
		if (address != null && !address.isEmpty() && address.length() >= 10 && name.length() <= 40) {
			System.out.println("address is valid ");
		} else {
			System.err.println("Address is Invalid ");
			valid = false;
		}

		String fathername = collegeAdmissionDTO.getFatherName();
		if (fathername != null && !fathername.isEmpty() && fathername.length() >= 3 && fathername.length() <= 30) {
			System.out.println("Father name is valid....");
		} else {
			System.err.println("Father name is invalid");
			valid = false;
		}

		String mothername = collegeAdmissionDTO.getMotherName();
		if (mothername != null && !mothername.isEmpty() && mothername.length() >= 3 && mothername.length() <= 30) {
			System.out.println("Mother name is valid....");
		} else {
			System.err.println("Mother name is invalid");
			valid = false;
		}
		String percentage=String.valueOf(collegeAdmissionDTO.getPercentage());
		
		if (percentage != null && !percentage.isEmpty() && percentage.length() >= 2
				) {
			System.out.println("Percentage is valid");
		} else {
			System.err.println("Percentage is Invalid");
			valid = false;
		}

		int age = collegeAdmissionDTO.getAge();
		if (age > 18) {
			System.out.println("Age is valid");
		} else {
			System.err.println("age is invalid");
			valid = false;
		}

		
	}
		return valid;
	}

	
}

package com.xworkz.studentform.service;

import com.xworkz.studentform.dto.StudentDTO;
import com.xworkz.studentform.repo.StudentRepositoryImp;

public class StudentServiceImp implements StudentService {

	@Override
	public boolean validate(StudentDTO studentDTO) {

		boolean valid = true;
		if (studentDTO != null) {
			System.out.println("studentDTO is not null");
			String firstName = studentDTO.getFirstName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(studentDTO.getPhoneNo());
			if (phoneNo != null && phoneNo.length() == 10 && phoneNo.startsWith("9")) {
				System.out.println("Phone No is valid");
			} else {
				valid = false;
				System.err.println("Phone No is Not valid");
			}
			int age = studentDTO.getAge();
			if (age > 5) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = studentDTO.getEmail();
			if (email != null && Character.isUpperCase(email.charAt(0)) && email.length() > 8
					&& email.charAt(7) == '@') {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				StudentRepositoryImp studentRepositoryImp = new StudentRepositoryImp();
				studentRepositoryImp.save(studentDTO);
			}
		}

		return valid;
	}

}

package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;

public class RegisterServiceImp implements RegisterService {

	@Override
	public boolean isValidAndSave(RegisterDTO registerDTO) {

		boolean valid = true;
		if (registerDTO != null) {
			System.out.println("registerDTO is not null");
			String name = registerDTO.getName();
			if (name != null && name.length() > 2 && name.length() < 30)
				System.out.println("name is valid");
			else {
				System.err.println("name not valid");
				valid = false;
			}

			String email = registerDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Email is valid");
			} else {
				System.out.println("Email is not vallid");
				valid = false;
			}
			int age = registerDTO.getAge();
			if (age >= 1 && age >= 18) {
				System.out.println("age is valid");
			} else {
				System.out.println("age is not valid");
				valid = false;
			}

		}
		return valid;
	}

}

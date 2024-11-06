package com.xworkz.charan.service;

import com.xworkz.charan.dto.SignupDTO;

public class SignupServiceImp implements SignupService {

	@Override
	public boolean isValidAndSave(SignupDTO signupDTO) {
		boolean valid=true;
		if(signupDTO!=null) {
			System.out.println("signupDTO is not null");
			String name = signupDTO.getUserName();
			if (name != null && name.length() > 2 && name.length() < 30)
				System.out.println("name is valid");
			else {
				System.err.println("name not valid");
				valid = false;
			}

			String email = signupDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Email is valid");
			} else {
				System.out.println("Email is not vallid");
				valid = false;
			}
			String password=signupDTO.getPassword();
			if( password!=null && !password.isEmpty()) {
				System.out.println("password is valid");
			}
			else {
				System.out.println("password is not valid");
				valid = false;
			
			}
			
			String conformPassword=signupDTO.getConformPassword();
			
			if( conformPassword!=null && !conformPassword.isEmpty()) {
				System.out.println("conformPassword is valid");
			}
			else {
				System.out.println("conformPassword is not valid");
				valid = false;
			
			}
			
			if(!conformPassword.equals(password)) {
				valid=false;
			}
		}
		return valid;
	}

}

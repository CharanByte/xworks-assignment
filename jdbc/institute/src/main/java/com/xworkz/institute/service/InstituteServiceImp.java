package com.xworkz.institute.service;

import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.repo.InstituteRepository;
import com.xworkz.institute.repo.InstituteRepositoryImp;

public class InstituteServiceImp implements InstituteService {

	@Override
	public boolean validate(InstituteDTO instituteDTO) {

		boolean valid = true;
		if (instituteDTO != null) {
			System.out.println("instituteDTO is not null");
			String firstName = instituteDTO.getName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(instituteDTO.getNumber());
			if (phoneNo != null && phoneNo.length() == 10) {
				System.out.println("PhoneNo is valid");
			} else {
				valid = false;
				System.err.println("PhoneNo is Not valid");
			}
//			String password=instituteDTO.getPassword();
//			if(password!=null && password.length()>4) {
//				System.out.println("password is valid");
//			}
//			 else {
//					valid = false;
//					System.err.println("password is Not valid");
//				}

			int age = instituteDTO.getAge();
			if (age > 18) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = instituteDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith("com") | email.endsWith("in"))) {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				InstituteRepositoryImp instituteRepositoryImp = new InstituteRepositoryImp();
				instituteRepositoryImp.save(instituteDTO);
			}

		}
		return valid;
	}

	public String getNameByPhone(String phone) {

		InstituteRepositoryImp imp = new InstituteRepositoryImp();
		String name = imp.getNameByPhone(phone);
		return name;

	}

}

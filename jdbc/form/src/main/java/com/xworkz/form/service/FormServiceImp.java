package com.xworkz.form.service;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.repo.FormRepository;
import com.xworkz.form.repo.FormRepositoryImp;

import lombok.val;

public class FormServiceImp implements FormService {

	@Override
	public boolean validate(FormDTO formDTO) {

		boolean valid = true;
		if (formDTO != null) {
			System.out.println("formDTo is not null");

			String name = formDTO.getName();
			if (name != null && name.length() > 4) {
				System.out.println("name is valid");
			} else {
				valid = false;
				System.out.println("name is not valid");
			}

			String email = formDTO.getEmail();
			if (email != null && email.contains("@gmail.com")) {
				System.out.println("email is valid");
			} else {
				valid = false;
				System.out.println("email is not valid");
			}
			int age = formDTO.getAge();
			if (age > 17) {
				System.out.println("age is  valid");
			} else {
				valid = false;
				System.out.println("age is not valid");
			}

			long number = formDTO.getMobileNo();

			if (valid) {
				FormRepository formRepositoryImp=new FormRepositoryImp();
				formRepositoryImp.save(formDTO);
			}

		}

		return valid;
	}

}

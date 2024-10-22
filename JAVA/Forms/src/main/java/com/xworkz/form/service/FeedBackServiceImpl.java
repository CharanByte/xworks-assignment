package com.xworkz.form.service;

import com.xworkz.form.dto.FeedbackFormDTO;

public class FeedBackServiceImpl implements FeedBackService{

	@Override
	public boolean validateAndSave(FeedbackFormDTO feedBackDTO) {
	
			boolean valid=true;
			if (feedBackDTO != null) {
				String name = feedBackDTO.getName();
				if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
					System.out.println("Given name is valid....");
				} else {
					System.err.println("Given name is invalid");
					 valid=false;
				}

				String email = feedBackDTO.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@")
						&& (email.endsWith(".com") || email.endsWith(".in"))) {
					System.out.println("Given email is valid....");
				} else {
					System.err.println("Given email is Invalid....");
					valid=false;
				}

				String comments = feedBackDTO.getComments();
				if (comments != null && !comments.isEmpty() && comments.length() >= 3 && comments.length() <= 100) {
					System.out.println("Given comments is valid....");
				} else {
					System.err.println("Given comments is invalid");
					valid=false;
				}

			}

			return valid;
		
	}
	

}

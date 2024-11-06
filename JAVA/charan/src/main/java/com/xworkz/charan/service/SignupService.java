package com.xworkz.charan.service;

import com.xworkz.charan.dto.SignupDTO;


public interface SignupService {
	
	boolean isValidAndSave(SignupDTO signupDTO);

}

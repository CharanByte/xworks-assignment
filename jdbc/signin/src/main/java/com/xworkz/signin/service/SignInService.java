package com.xworkz.signin.service;

import com.xworkz.signin.dto.SignInDTO;

public interface SignInService {
	
	boolean validate(SignInDTO signInDTO);
}

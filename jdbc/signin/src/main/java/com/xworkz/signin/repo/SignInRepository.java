package com.xworkz.signin.repo;

import com.xworkz.signin.dto.SignInDTO;

public interface SignInRepository {
	
	boolean save(SignInDTO signInDTO);

}

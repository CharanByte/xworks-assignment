package com.xworkz.signin.service;

import com.xworkz.signin.dto.SignInDTO;
import com.xworkz.signin.repo.SignInRepository;
import com.xworkz.signin.repo.SignInRepositoryImp;

public class SignInServiceImp  implements SignInService{

	@Override
	public boolean validate(SignInDTO signInDTO) {
		
		boolean valid=true;
		if(signInDTO!=null) {
		String name=signInDTO.getUserName();
		if(name!=null && name.contains("@") && (name.endsWith(".com")||name.endsWith("in"))) {
			System.out.println("email is valid");
		}
		else {
			System.err.println("email not valid");
			valid=false;
		}
		String password=signInDTO.getPassword();
		
		if(password!=null && password.length()>5) {
			System.out.println("password valid");
		}
		else {
			System.err.println("password not valid");
			valid=false;
		}
			
		}
		if(valid) {
		SignInRepository signInRepositoryImp =new  SignInRepositoryImp();
		 boolean isSaved= signInRepositoryImp.save(signInDTO);
		 
		}
		
		return valid;
	}


}

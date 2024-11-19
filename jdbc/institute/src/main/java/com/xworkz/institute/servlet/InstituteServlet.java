package com.xworkz.institute.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.service.InstituteService;
import com.xworkz.institute.service.InstituteServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/select")
public class InstituteServlet extends HttpServlet {
	
	public InstituteServlet() {
		System.out.println("running no args InstituteServlet const");
	}
	int id=1;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("passwod");
		String number=req.getParameter("number");
		String age=req.getParameter("age");
		String address=req.getParameter("address");
		
		long convertedNumber=Long.valueOf(number);
		int convertedAge=Integer.valueOf(age);
		
		InstituteDTO instituteDTO=new InstituteDTO(name, email, password, convertedNumber, convertedAge, address,id);
				
		InstituteServiceImp instituteServiceImp=new InstituteServiceImp();
		boolean saved=instituteServiceImp.validate(instituteDTO);
		if(saved) {
			System.out.println("valid and saved ");
			id=id+1;
			System.out.println(id);

		}
		else
			System.err.println("invalid and not saved");
		
		
	}

	
}

package com.xworkz.charan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.charan.dto.SignupDTO;
import com.xworkz.charan.service.SignupService;
import com.xworkz.charan.service.SignupServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/login")
public class SignupServlet extends HttpServlet {
	public SignupServlet() {
		System.out.println("created SignupServlet const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	
		String user=arg0.getParameter("user");
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("password");
		String conformPassword=arg0.getParameter("conformpassword");
		
		SignupDTO signupDTO=new SignupDTO(user, email, password, conformPassword);
		
		SignupService imp=new SignupServiceImp();
		boolean isvalid= imp.isValidAndSave(signupDTO);
		
		if(isvalid) {
			arg0.setAttribute("success",user+" your signup completed");
		}
		else {
			arg0.setAttribute("failure",user+" your signup failure");
			arg0.setAttribute("dto",signupDTO);
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("Signup.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}

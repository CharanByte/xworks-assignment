package com.xworkz.form.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.service.FormService;
import com.xworkz.form.service.FormServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/form")
public class FormServlet  extends HttpServlet{
	
	public FormServlet() {
	
		System.out.println("running no args FormServlet const");// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String age=arg0.getParameter("age");
		String number=arg0.getParameter("number");
		
		int convertedAge=Integer.valueOf(age);
		long convertedNumber=Long.valueOf(number);
		
		FormDTO formDTO=new FormDTO(name, email, convertedAge, convertedNumber);
		
		FormService serviceImp=new FormServiceImp();
		boolean isvalid=serviceImp.validate(formDTO);
		if(isvalid) {
			System.out.println("valid and saved into db");
			arg0.setAttribute("success", "Saved into DataBase");
		}
		else {
			System.out.println("not valid and not saved into db");
			arg0.setAttribute("failure", "Not Saved into DataBase");
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}

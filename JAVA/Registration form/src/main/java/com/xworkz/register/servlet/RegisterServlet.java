package com.xworkz.register.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
		System.out.println("running RegisterServlet const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		String age = arg0.getParameter("age");
		String city = arg0.getParameter("city");
		String state = arg0.getParameter("state");
		
		int convertedAge=Integer.valueOf(age);
		
		
	}
}

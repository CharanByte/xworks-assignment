package com.xworkz.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(loadOnStartup = 1,urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
	public LoginServlet() {
		System.out.println("created LoginServlet");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
	System.out.println("Running service in LoginServlet");
	}

}

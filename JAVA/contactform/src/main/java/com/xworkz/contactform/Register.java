package com.xworkz.contactform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/reg")
public class Register extends HttpServlet {
	
	public Register() {
		System.out.println("created Register const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String req=arg0.getParameter("firstname");
		String req1=arg0.getParameter("lastname");
		String req2=arg0.getParameter("email");
		String req3=arg0.getParameter("mobile");
		String req4=arg0.getParameter("password");
		String req5=arg0.getParameter("conform password");
		String req6=arg0.getParameter("country");
		String req7=arg0.getParameter("state");
		String req8=arg0.getParameter("city");
		
		
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("Register is success");
	}

}

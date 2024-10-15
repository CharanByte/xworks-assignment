package com.xworkz.contactform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup = 1,urlPatterns = "/contact")
public class Contact extends HttpServlet {

	public Contact() {
		System.out.println("created contact const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String req=arg0.getParameter("name");
		String req1=arg0.getParameter("email");
		String req2=arg0.getParameter("mobile");
		String req3=arg0.getParameter("age");
		String req4=arg0.getParameter("address");
	
		System.out.println(req);
		System.out.println(req1);
		System.out.println(req2);
		System.out.println(req3);
		System.out.println(req4);
		
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("contact is success");
	}
}

package com.xworkz.contactform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/search")
public class Search extends HttpServlet{

	public Search() {
		System.out.println("created search const");	
		
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String ref=arg0.getParameter("email");
		
		System.out.println("email : "+ref);
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("Search is success");
	}
}

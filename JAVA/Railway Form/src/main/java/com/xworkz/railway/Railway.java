package com.xworkz.railway;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/rail")
public class Railway extends HttpServlet{
	
	public Railway() {
		System.out.println("created Railway const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String ref=arg0.getParameter("names");
		
		System.out.println(ref);
		
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println(ref);
	}
	

}

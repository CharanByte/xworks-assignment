package com.xworkz.contactform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class Order extends HttpServlet {
	
	public Order() {
		System.out.println("created order");
	}
	
	@Override
	protected void service(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)
			throws javax.servlet.ServletException, IOException {
		
		String req=arg0.getParameter("customer name");
		String req1=arg0.getParameter("item");
		String req2=arg0.getParameter("quantity");
		
		System.out.println(req);
		System.out.println(req1);
		System.out.println(req2);
		
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("Order is success");
		
		
	}
		
		
	}




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
		
		
		arg1.setContentType("text/html");
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("<h1>"+"Success"+"</h1>");
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("<h2> Name  : "+arg0.getParameter("names")+"</h3>");
		printWriter.println("<h4> Source  : "+arg0.getParameter("source")+"</h4>");
		printWriter.println("<h4> Destination  : "+arg0.getParameter("Destination")+"</h4>");
		printWriter.println("<h4> Start date  : "+arg0.getParameter("startdate")+"</h4>");
		printWriter.println("<h4> Return date  : "+arg0.getParameter("returndate")+"</h4>");
		printWriter.println("<h4> Seat Type  : "+arg0.getParameter("type")+"</h4>");
		printWriter.println("<h4> Total Ticket : "+arg0.getParameter("ticket")+"</h4>");
		printWriter.println("<h4> No Of Male  : "+arg0.getParameter("male")+"</h4>");
		printWriter.println("<h4> No Of Female  : "+arg0.getParameter("female")+"</h4>");
		printWriter.println("</body>");
		printWriter.println("</html>");
	}
	

}

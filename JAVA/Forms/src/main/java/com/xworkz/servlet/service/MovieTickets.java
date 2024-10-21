package com.xworkz.servlet.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.MovieTicketsDTO;



@WebServlet(loadOnStartup = 1,urlPatterns = "/movie")
public class MovieTickets extends HttpServlet {
	
	public MovieTickets() {

		System.out.println("no arg const of MovieTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		String totalTickets=req.getParameter("totalTickets");
		String theaterName=req.getParameter("theaterName");
		String seatType=req.getParameter("seatType");
		String donation=req.getParameter("donation");
		String date=req.getParameter("date");
		String time=req.getParameter("time");
		int convertedTotalTickets=Integer.valueOf(totalTickets);
		double convertedDonation=Double.valueOf(donation);

		MovieTicketsDTO movieTicketsDTO=new MovieTicketsDTO(name, convertedTotalTickets, theaterName, seatType, convertedDonation, date, time);
		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");

		printWriter.println("<h1>" + "Success in Sending Data" + "</h1>");

		printWriter.println("</body>");

		printWriter.println("</html>");
			}
}
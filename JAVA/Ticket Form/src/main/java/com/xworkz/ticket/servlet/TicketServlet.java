package com.xworkz.ticket.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticket.dto.TicketDTO;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.service.TicketServiceImp;
@WebServlet(loadOnStartup = 1,urlPatterns = "/ticket")
public class TicketServlet extends HttpServlet {
	public TicketServlet() {
		System.out.println("crested const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String ticketName=arg0.getParameter("name");
		String ticketNo=arg0.getParameter("ticket");
		String contact=arg0.getParameter("contact");
		String email=arg0.getParameter("email");
		
		int convertedTicketNo=Integer.valueOf(ticketNo);
		long convertedTicketContact=Long.valueOf(contact);
		TicketDTO ticketDTO=new TicketDTO(ticketName, convertedTicketNo, convertedTicketContact, email);
		
		TicketService serviceImp=new TicketServiceImp();
		boolean isValid=serviceImp.isValidAndSave(ticketDTO);
		if(isValid) {
			System.out.println("data is valid");
			arg0.setAttribute("success", "Ticket Booked");
		}
		else {
			System.out.println("data is not valid");
			arg0.setAttribute("failure", "Validation error");
			arg0.setAttribute("dto", ticketDTO);
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("ticket.jsp");
		requestDispatcher.forward(arg0, arg1);
		
	}
}

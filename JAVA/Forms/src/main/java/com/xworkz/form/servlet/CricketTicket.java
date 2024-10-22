package com.xworkz.form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.CricketTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cricket")
public class CricketTicket extends HttpServlet {

	public CricketTicket() {

		System.out.println("no arg const of CricketTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String groundName = req.getParameter("groundName");
		String customerName = req.getParameter("customerName");
		String customerEmail = req.getParameter("customerEmail");
		String seatType = req.getParameter("seatType");
		String numberOfTickets = req.getParameter("numberOfTickets");
		int convetedNumberOfTickets = Integer.valueOf(numberOfTickets);

		CricketTicketDTO cricketTicketDTO = new CricketTicketDTO(groundName, customerName, customerEmail, seatType,
				convetedNumberOfTickets);

		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");

		printWriter.println("<h1>" + "Success in Sending Data" + "</h1>");

		printWriter.println("</body>");

		printWriter.println("</html>");
	}

}

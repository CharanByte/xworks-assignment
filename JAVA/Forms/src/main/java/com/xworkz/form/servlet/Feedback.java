package com.xworkz.form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.FeedbackFormDTO;
import com.xworkz.form.service.FeedBackService;
import com.xworkz.form.service.FeedBackServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/feedback")
public class Feedback extends HttpServlet {

	public Feedback() {
		System.out.println("created Feedback const ");

	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		String comments = arg0.getParameter("comments");

		FeedbackFormDTO dto = new FeedbackFormDTO(name, email, comments);
		
		FeedBackService service=new FeedBackServiceImpl();
		boolean valid =service.validateAndSave(dto);
		
		if(valid) {
			System.out.println("Data is valid");
		}
		else {
			System.out.println("Data is Invalid");
		}
		
		arg0.setAttribute("name", name);
		arg0.getRequestDispatcher("/feedback.jsp").forward(arg0, arg1);
//		arg1.setContentType("text/html");
//		
//		
//
//		PrintWriter printWriter = arg1.getWriter();
//		printWriter.println("<html>");
//		printWriter.println("<body>");
//
//		printWriter.println("<h1>" + "Success in Sending Data" + "</h1>");
//
//		printWriter.println("</body>");
//
//		printWriter.println("</html>");
	}

}

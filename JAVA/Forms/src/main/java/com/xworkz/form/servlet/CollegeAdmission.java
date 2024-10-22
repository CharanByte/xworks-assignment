package com.xworkz.form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.CollegeAdmissionDTO;
import com.xworkz.form.service.CollegeAdmissionImp;
import com.xworkz.form.service.CollegeAdmissionService;
@WebServlet(loadOnStartup = 1,urlPatterns = "/college")
public class CollegeAdmission  extends HttpServlet {

	public CollegeAdmission() {
		System.out.println("created CollegeAdmission const ");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String mobile=arg0.getParameter("mobileNo");
		String address=arg0.getParameter("address");
		String fatherName=arg0.getParameter("fatherName");
		String percentage=arg0.getParameter("percentage");
		String motherName=arg0.getParameter("motherName");
		String course=arg0.getParameter("course");
		String age=arg0.getParameter("age");
		Long convertedMobile=Long.valueOf(mobile);
		Double convertedPercentage=Double.valueOf(percentage);
		Integer convertedAge=Integer.valueOf(age);
		CollegeAdmissionDTO ref =new CollegeAdmissionDTO(name, email, convertedMobile, address, fatherName, motherName,convertedPercentage, course,convertedAge);
		
		CollegeAdmissionService service=new CollegeAdmissionImp();
		boolean valid=service.validateAndSave(ref);
		
		if(valid) {
			System.out.println("Data  is valid");
		}
		else{
			System.out.println("Data  is Invalid");

			
		}
		arg1.setContentType("text/html");
		
		PrintWriter printWriter=arg1.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");
		
		printWriter.println("<h1>"+"Success in Sending Data"+"</h1>");

		printWriter.println("</body>");

		printWriter.println("</html>");		
	}
}

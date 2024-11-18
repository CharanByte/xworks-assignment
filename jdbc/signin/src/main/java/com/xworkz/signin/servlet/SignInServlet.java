package com.xworkz.signin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signin.dto.SignInDTO;
import com.xworkz.signin.service.SignInService;
import com.xworkz.signin.service.SignInServiceImp;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signin")
public class SignInServlet extends HttpServlet {

	public SignInServlet() {
		System.out.println("running no args SignInServlet const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println(name);
		String password = req.getParameter("password");
		System.out.println(password);

		SignInDTO signInDTO = new SignInDTO(name, password);
		SignInService signInServiceImp = new SignInServiceImp();
		boolean saved = signInServiceImp.validate(signInDTO);
		if (saved) {
			System.out.println("saved into database");
			req.setAttribute("success", "Saved into Database");
		} else {
			System.out.println("error");
			req.setAttribute("failure", "Not Saved into Database");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("valid.jsp");
		requestDispatcher.forward(req, resp);
	}
}

package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/product")
public class ProductServlet extends HttpServlet{

	public ProductServlet() {
		System.out.println("createt ProductServlet const ");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String companyName=arg0.getParameter("companyName");
		String productName=arg0.getParameter("productName");
		String productType=arg0.getParameter("type");
		String productQuantiy=arg0.getParameter("productQuantiy");
		String productCost=arg0.getParameter("productCost");
	}
}

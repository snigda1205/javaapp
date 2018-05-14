package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/registerProcess")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String zip=request.getParameter("zip");
		PrintWriter pw=response.getWriter();
		pw.println("Register Servlet");
		pw.println("<p> Username: "+username+"</p>");
		pw.println("First Name: "+fname);
		pw.println("Last Name: "+lname);
		
	}

}

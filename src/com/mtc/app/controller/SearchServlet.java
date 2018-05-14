package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.dao.ProductDao;
import com.mtc.app.entity.Product;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/searchProduct")
public class SearchServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("productId"));
		
		ProductDao productDao=new ProductDao();

		
		Product p=productDao.FindByInt(pid);
		request.setAttribute("product", p);
		RequestDispatcher dispatcher=request.getRequestDispatcher("ProductSearch.jsp");
		dispatcher.forward(request, response);
		
	
		/**PrintWriter pw=response.getWriter();
		pw.println("<h2>Product Records</h2>");
		pw.println("<p> Product Id : "+p.getId()+"</p>");
		pw.println("<p> Product Name : "+p.getName()+"</p>");
		pw.println("<p> Product Price : "+p.getPrice()+"</p>");
		pw.println("<p> Product Description : "+p.getDescription()+"</p>");**/
	}

	

}

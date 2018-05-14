package com.mtc.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.dao.ProductDao;
import com.mtc.app.entity.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	
		       
		   
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
		ProductDao productDao=new ProductDao();

				
				List<Product> p=productDao.findall();
				request.setAttribute("product", p);
				RequestDispatcher dispatcher=request.getRequestDispatcher("product.jsp");
				dispatcher.forward(request, response);
			}

		}

	

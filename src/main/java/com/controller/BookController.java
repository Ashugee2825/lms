package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.entity.*;
/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		int isbn= Integer.parseInt(request.getParameter("isbn"));
		String bname=request.getParameter("bname");
		int price= Integer.parseInt(request.getParameter("price"));
		Book b= new Book();
	    b.setIsbn(isbn);
	    b.setBname(bname);
	    b.setPrice(price);
		BookDao r= new BookDao();
		r.addBookData(b);
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
	
}


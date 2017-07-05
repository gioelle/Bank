package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Customer;

/**
 * Servlet implementation class LoginServlet
 * This login servlet should accept a username and password
 * check those values as a key value pair against a list in a file
 * if valid, redirect to account page
 * if invalid, display warning
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setUsername(request.getParameter("username"));
		c.setPassword(request.getParameter("password"));
		
		//read a text file that contains key value pairs and compare them to user entry.
		//File to read: C:\Users\Joelle.Fronzaglio\Documents\GhostWriter\UserNameAndPassword.txt
		//display an error message if no match found
		//redirect to account page if a match is found
		
		HttpSession session = request.getSession(true);
		session.setAttribute("customer", c);
		
		
		//inside an if - statement "If key value pair match is found", then:
		RequestDispatcher rs = request.getRequestDispatcher("account.jsp");
		rs.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.account.Account;
import com.user.Customer;

/**
 * Servlet implementation class NewAccount
 */
@WebServlet("/NewAccount")
public class NewAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		Customer c = (Customer) session.getAttribute("customer");
		String type = request.getParameter("type");
		
		
		
		Account customerAccount = new Account(type);
		customerAccount.generateNumber(c.getLast4());
		if(type.equals("checking")) {
			customerAccount.hasDebitCard(request.get("debit"));
		} 
		//use soemthing to capture whether debit card & checks were selected. This is angry because it's expecting a boolean.
		customerAccount.setHasChecks(request.getParameter("checks"));
		customerAccount.setHasDebitCard(request.getParameter("debit"));
		
		c.getAccountList().add(customerAccount);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

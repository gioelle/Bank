package com.servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.account.Account;
import com.user.Customer;

/**
 * Servlet implementation class NewAccountServlet
 */
@WebServlet("/NewAccountServlet")
public class NewAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In new account");
		
		HttpSession session = request.getSession(true);
		Customer c = (Customer) session.getAttribute("customer");
		
		String type = request.getParameter("newAccount");
		Account customerAccount = new Account();
		
		if(type.equals("savings"))
		{
			
			customerAccount.setAccountValues(type);
			customerAccount.generateNumber(c.getLast4());
		
		}
		else {
			
			System.out.println(request.getParameter("addFeature"));
			System.out.println(request.getParameter("addFeature2"));
			
			customerAccount.setAccountValues(request.getParameter("addFeature")!= null?false:true,request.getParameter("addFeature2")!= null?false:true);
			customerAccount.generateNumber(c.getLast4());
		}
		
		if(c.getAccountList() == null) {
			c.setAccountList(new ArrayList<Account>());
			
		}
		c.getAccountList().add(customerAccount);
		request.getSession().setAttribute("accountList", c.getAccountList());
		RequestDispatcher rs = request.getRequestDispatcher("account.jsp");
		rs.forward(request,response);
		
		save("C:\\Users\\Joelle.Fronzaglio\\Documents\\GhostWriter\\BankFiles.txt", c.toString() + customerAccount.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//save("C:\\Users\\Joelle.Fronzaglio\\Documents\\GhostWriter\\BankFiles.txt", c.toString() + customerAccount.toString());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public static void save(String pathAndFileName, String data) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathAndFileName, true))){
			bw.append(data);
			System.out.println("All Good here.");
		}catch(IOException e) {	}	
	}

}



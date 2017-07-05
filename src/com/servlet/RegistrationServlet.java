package com.servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Address;
import com.user.Customer;

/**
 * Servlet implementation class RegistrationServlet
 * This servlet collects data used on the login/register page 
 * and should check the username against existing usernames
 * then write the new user to a file 
 * then redirect the user to the account home page.
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		Address a = new Address();
		c.setFirstName(request.getParameter("firstName"));
		c.setLastName(request.getParameter("lastName"));
		c.setEmail(request.getParameter("email"));
		c.setUsername(request.getParameter("username"));
		c.setPassword(request.getParameter("password"));
		a.setStreetAddress(request.getParameter("streetAddress"));
		a.setCity(request.getParameter("city"));
		a.setState(request.getParameter("state"));
		a.setZipcode(request.getParameter("zipCode"));
		c.setAddress(a);
		
		//call save function here and write into file.
		save("C:\\Users\\Joelle.Fronzaglio\\Documents\\GhostWriter\\BankFiles.txt", c.toString());
	
		//call save function here and write U&P into separate file.
		save("C:\\Users\\Joelle.Fronzaglio\\Documents\\GhostWriter\\UserNameAndPassword.txt", c.getUsername() + "," + c.getPassword());

		//need to check whether username already exists. Add this later.
		
		HttpSession session = request.getSession(true);
		session.setAttribute("customer", c);
		
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
	
	public static void save(String pathAndFileName, String data) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathAndFileName))){
			bw.write(data);
			System.out.println("All Good here.");
		}catch(IOException e) {	}	
	}

}

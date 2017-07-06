package com.servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		HttpSession session = request.getSession(true);
		
		String username = request.getParameter("username");
		String pswd = request.getParameter("password");
		
			
		List<Customer> customers = read("C:\\Users\\Joelle.Fronzaglio\\Documents\\GhostWriter\\BankFiles.txt");
		System.out.println("right below the read function is called."+customers.size());
		
		for(int i =0; i < customers.size(); i++)
		{
			System.out.println("inside the for loop");
			String temp = customers.get(i).getUsername();
			System.out.println(temp);
			
			if(username.trim().equals(customers.get(i).getUsername()) && pswd.trim().equals(customers.get(i).getPassword())) 
			{
				System.out.println(username + pswd);
				System.out.println(customers.get(i).getUsername() + customers.get(i).getPassword());
				session.setAttribute("customer", customers.get(i));
				RequestDispatcher rs = request.getRequestDispatcher("account.jsp");
				rs.forward(request,response);
			}
			else 
			{
				session.setAttribute("error", "Incorrect Username or Password");
				RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
				rs.forward(request,response);
			}
		}
			
		//read a text file that contains key value pairs and compare them to user entry.
		//File to read: C:\Users\Joelle.Fronzaglio\Documents\GhostWriter\UserNameAndPassword.txt
		//display an error message if no match found
		//redirect to account page if a match is found
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static List<Customer> read(String pathAndFileName) {
		File file = new File(pathAndFileName);
		List<Customer> customers = new ArrayList<>();
			if(file.exists()) {
				try(Scanner scanner = new Scanner(file)){
					while(scanner.hasNextLine()) {
						String line = scanner.nextLine();
						String[] parseData = line.split(",");
						System.out.println(parseData[1]);
						String firstName = parseData[0];
						String lastName = parseData[1];
						String email = parseData[2];
						String username = parseData[3];
						String password = parseData[4];
						String streetAddress = parseData[5];
						String city = parseData[6];
						String state = parseData[7];
						String zipcode = parseData[8];
						Address address = new Address(streetAddress, city, state, zipcode);
						
						Customer testCustomer = new Customer(firstName, lastName, email, username, password, address);
						customers.add(testCustomer);
					    System.out.println(customers.size());
					
					}
				}catch(FileNotFoundException ex) {
					
				}
			
			}
		return customers;
	}
}

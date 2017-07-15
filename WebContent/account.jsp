<!--  need a way to read from the file here to populate the account page based on the login used. -->
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.user.Customer" %>
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<% Customer c = (Customer) session.getAttribute("customer"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet" type="text/css">
<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	    style: float-right;
	}
	
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}
	
	tr {
	    background-color: #dddddd;
	}

	
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Home</title>
</head>
<body style="background: url('file:///Users/Joelle.Fronzaglio/Downloads/background.png')">>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
		<div class="navbar-header">
			<button type="button" class="btn btn-info" data-toggle="collapse in" data-target="#navbar"></button>
				<div id="navbar" class="collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</div>
			Welcome to MilleniaBank
		</div>
		<div id="navbar" class="navbar-colapse collapse"></div> 
		</div>
	</nav>
		<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron" style="font-family: lobster; background: url('file:///Users/Joelle.Fronzaglio/Downloads/Coins.jpg')">
		<div class="container">
		<h1>Hello, <% out.print(c.getFirstName()); %></h1>
		<p style="font-size: 35px; color: ab0fc8; text-shadow: 2px 2px #000000;">This is your account summary.</p>
		<p style="font-size: 35px; color: ab0fc8; text-shadow: 2px 2px #000000;"> If you don't like what you see, contact us for some budgeting and investment advice.</p>
		</div>
	</div>
	<div style="float-left" class="container">
	<!-- account menu actions here, each with a method... -->
	<div class="row">
	<div class="col-md-4">
	<h2>The options:</h2>
	<p></p>
	<form action="NewAccountServlet" method="post">
	<!--  this is supposed to toggle ON when clicked, currently defaults ON. -->
	<button onclick="myFunction()" value="newAccount" type="button" class="btn btn-default">I need a new account.</button>
		
		 <div id="myDIV">
			<input type="radio" name="newAccount" value="checking" id="checking" class="accountType"/>
			<label for="checking">Checking Account</label>
			<br>
			<input type="checkbox" name="addFeature" value="debit" id="debit" class="debit"/>
			<label for="debit">Add a Debit Card (checking only)</label>
			<br>
			<input type="checkbox" name="addFeature2" value="checks" id="checks" class="checks"/>
			<label for="checks">Add Checks (checking only)</label>
			<br>
			<input type="radio" name="newAccount" value="savings" id="savings" class="accountType"/>
			<label for="savings">Savings Account</label>
			<br>
			<button type="submit" class="btn btn-default">Submit</button>
		
		</div>
		<script>
			function myFunction() {
			    var x = document.getElementById('myDIV');
			    if (x.style.display === 'none') {
			        x.style.display = 'block';
			    } else {
			        x.style.display = 'none';
			    }
			}
		</script>
	</form>
	<button type="button" class="btn btn-default">Long-Term Relationship (Statement)</button>
	<!--  Servlet to handle transactino array printing (sort by date, print from 1st to 1st -->
	<button type="button" class="btn btn-default">What have I done? (Recent Transactions)</button>
	<!--  Servlet to handle transaction array printing-->
	<button type="button" class="btn btn-default">Fatten or Break the PiggyBank (Transfer)</button>
	<!--  Only works if two+ accounts exist-->
	<button type="button" class="btn btn-default">People want my money! (Bill Payer)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Who uses cash anymore? (Request a debit card)</button>
	<!--  Change boolean of account parameter hasDebit to true -->
	<button type="button" class="btn btn-default">My landlord said I need to use 'checks'... What are those?</button>
	<!-- Change boolean of account parameter hasChecks to true -->
	<button type="button" class="btn btn-default">I'm Broke, get me out of here. (Close Account)</button>
	<!--  -->
	<button type="button" class="btn btn-default">I've been hacked! (Report fraud, immediately block checks & debit card transactions)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<form action="LogOutServlet" method="post">
	<button type="submit" class="btn btn-default">Mischief Managed (Log Out)</button>
	</form>
	
	</div>
	</div>
	</div>
	



  
 	<table style="float-right" class="table table-hover">
	<c:if test="${accountList != null}">
		<tr>
		    <th>Account Number</th>
		    <th>Balance</th>
		    <th>Account Type</th>
		</tr>
	<c:forEach items="${accountList}" var="attribute">
			<tr>
				<td>${attribute.accountNumber}</td>
				<td>${attribute.balance}</td>
			 	<td>${attribute.type}</td>
			
			</tr>
	</c:forEach>
		</c:if>
		
	
	</table>

		
</body>
</html>
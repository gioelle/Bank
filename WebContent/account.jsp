<!--  need a way to read from the file here to populate the account page based on the login used. -->
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.user.Customer" %>
 <link rel="stylesheet" href="./styles/bootstrap.min.css">
<% Customer c = (Customer) session.getAttribute("customer"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Home</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
			Welcome to MilleniaBank
		</div>
		<div id="navbar" class="navbar-colapse collapse"></div> 
		</div>
	</nav>
		<!-- Main jumbotron for a primary marketin gmessage or call to action -->
	<div class="jumbotron">
		<div class="container">
		<h1>Hello, <% out.print(c.getFirstName()); %></h1>
		<p>This is your account summary. If you don't like what you see, contact us for some budgeting and investment advice.</p>
		</div>
	</div>
	<div style="float-left" class="container">
	<!-- account menu actions here, each with a method... -->
	<div class="row">
	<div class="col-md-4">
	<h2>The options:</h2>
	<p></p>
	<form action="NewAcount" method=post>
	<!--  this is supposed to toggle ON when clicked, currently defaults ON. -->
	<button onclick="myFunction()" value="newAccount" type="button" class="btn btn-default">I need a new account.</button>
		  <div id="myDIV">
			<input type="radio" name="newAccount" value="checking" id="checking" class="accountType"/>
			<label for="checking">Checking Account</label>
			<br>
			<input type="checkbox" name="newAccount" value="debit" id="debit" class="debit"/>
			<label for="debit">Add a Debit Card (checking only)</label>
			<br>
			<input type="checkbox" name="newAccount" value="checks" id="checks" class="checks"/>
			<label for="checks">Add Checks (checking only)</label>
			<br>
			<input type="radio" name="newAccount" value="savings" id="savings" class="accountType"/>
			<label for="savings">Savings Account</label>
		
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
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">What have I done? (Recent Transactions)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Fatten or Break the PiggyBank (Transfer)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">People want my money! (Bill Payer)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Who uses cash anymore? (Request a debit card)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">My landlord said I need to use 'checks'... What are those?</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">I'm Broke, get me out of here. (Close Account)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">I've been hacked! (Report fraud, immediately block checks & debit card transactions)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Mischief Managed (Log Out)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	</div>
	</div>
	</div>
	
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
	
	tr:nth-child(even) {
	    background-color: #dddddd;
	}
</style>


<body>

  
 	<table style="float-right" class="table table-hover">
	<c:if test="${accountList != null}">
		<tr>
		    <th>Account Number</th>
		    <th>Balance</th>
		    <th>Account Type</th>
		</tr>
	<c:forEach var="customer" items="${customerAccount}">
			<tr>
				<td><c:out value="${customer.getAccountNumber}"/></td>
				<td><c:out value="${customer.getBalance}"/></td>		
				<td><c:out value="${customer.getProfesesor}"/></td>
			</tr>
	</c:forEach>
		</c:if>
		
	
	</table>

		
</body>
</html>
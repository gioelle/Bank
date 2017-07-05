<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.user.Customer" %>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<% Customer c = (Customer) session.getAttribute("customer"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	<div id=divLeft class="container">
	<!-- account menu actions here, each with a method... -->
	<div class="row">
	<div class="col-md-4">
	<h2>The options:</h2>
	<p></p>
	<!--  Request Debit Card, Request Checks, Request New Account, View & Print Statement, View n Recent Transactions, Transfer, Close Account -->
	<button type="button" class="btn btn-default">Long-Term Relationship (Statement)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">What have I done? (Recent Transactions)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Fatten or Break the PiggyBank (Transfer)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">People want my money! (Bill Payer)</button>
	<!--  Button click takes to a new webpage, need a servlet to handle the button clicks themselves. -->
	<button type="button" class="btn btn-default">Ummm... I need a new one. (Request New Account)</button>
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
	<!-- 
	<div id=divRight class="container">
	<div class="row">
	<div class="col-md-4">
	<h2>Your Current Account Summary:</h2>
	<p></p> -->
	<!-- need to display each part of the customer's array list here with titles "Savings" and "Checking" -->
	
		
</body>
</html>
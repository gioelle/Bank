<!-- This is the login or register page, meant to be the first page in the flow. -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MilleniaBank: Real People Serving Real People</title>
<link rel="stylesheet" type="text/css" href=".styles/styles.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
	<form class = "container" action="LoginServlet" method="post">
		<h1>Welcome Back!</h1>
		<div class="form-group">
			<label for="username">Your Witty Handle Here:</label>
			<input type="text" class="form-control" name="username" id="username" placeholder="username">
		</div>
		<div class="form-group">
			<label for="password">Top-Secret Unsharable KeyPhrase here:</label>
			<input type="password" class="form-control" name="password" id="password" placeholder="password">
		</div>
		<!-- <button type = "submit" class="btn btn-default">I forgot the code words!</button> -->
		<button type = "submit" class="btn btn-default">To my accounts!</button>
	</form>


	<form class = "container" action="RegistrationServlet" method="post">
		<h1>Not yet in the club? Sign up here!</h1>
		<div class="form-group">
			<label for="firstName">First Name</label>
			<input type="text" class="form-control" name="firstName" id="firstName" placeholder="Jane">
		</div>
		<div class="form-group">
			<label for="lastName">Last Name</label>
			<input type="text" class="form-control" name="lastName" id="lastName" placeholder="Doe">
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<input type="email" class="form-control" name="email" id="email" placeholder="janeDoe@camelCase.com">
		</div>
		<div class="form-group">
			<label for="username">Username</label>
			<input type="text" class="form-control" name="username" id="username" placeholder="janedoeeyes">
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input type="password" class="form-control" name="password" id="password" placeholder="s0m3t#ingComp!ex&un1que">
		</div>
		<div class="form-group">
			<label for="streetAddress">Street Address</label>
			<input type="text" class="form-control" name="streetAddress" id="streetAddress" placeholder="123 Rebel Avenue">
		</div>
		<div class="form-group">
			<label for="city">City</label>
			<input type="text" class="form-control" name="city" id="city" placeholder="Rock City">
		</div>
		<div class="form-group">
			<label for="state">State</label>
			<input type="text" class="form-control" name="state" id="state" placeholder="Ofmind">
		</div>
		<div class="form-group">
			<label for="zipCode">Zip Code</label>
			<input type="text" class="form-control" name="zipCode" id="zipCode" placeholder="8675309">
		</div>
		<div class = "checkbox">
		<label> <input type="checkbox">I agree to the terms and conditions. Terms and Conditions: We'll be thoughtful about how we perform business.</label>
		</div>
		<button type = "submit" class="btn btn-default">Let's do this.</button>
	</form>
</body>
</html>
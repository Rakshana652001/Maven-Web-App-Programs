<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/register" method="post">
	<h3>Registration Form</h3>
	<label>Name: <input type="text" name="name" id="name" required></label><br><br>
	<label>Phone Number: <input type="tel" maxlength="10" name="phoneNumber" id="phoneNumber" required></label><br><br>
	<label>Email ID: <input type="email" name="emailId" id="emailId" required></label><br><br>
	<label>Password: <input type="password" name="password" id="password" required></label><br><br>
	<button>Submit</button>
</form>
</body>
</html>
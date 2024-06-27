<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="xml">
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<%
	String name = request.getParameter("name");
%>
<form action="/update" method="post">
	<h3>Update</h3>
	<label>Name: <input type="text" name="name" value="<%= name %>" readonly></label>	
	<label>Phone Number: <input type="tel" maxlength="10" name="phoneNumber" id="phoneNumber" pattern="[789][0-9]{9}" placeholder="7339263883" required></label><br><br>
	<label>Password: <input type="password" name="password" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" placeholder="Raksha@12" required></label><br><br>
	<input type="submit" value="Update">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("name");
%>
<form action="/update" method="post">
	<h3>Update</h3>
	<label>Name: <input type="text" name="name" value="<%= name %>" readonly></label>
	<label>Phone Number: <input type="tel" maxlength="10" name="phoneNumber" id="phoneNumber" required></label><br><br>
	<label>Password: <input type="password" name="password" id="password" required></label><br><br>
	<input type="submit" value="Update">
</form>
</body>
</html>
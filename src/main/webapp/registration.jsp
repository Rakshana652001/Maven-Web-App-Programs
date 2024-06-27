<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="xml">
<head>
<meta charset="ISO-8859-1">
<title>Registeration form</title>
</head>
<body>
<form action="/register" method="post">
	<h3>Registration Form</h3>
	<label>Name: <input type="text" name="name" id="name" placeholder="Rakshana" pattern="^[A-Za-z]+$" required></label><br><br>
	<label>Phone Number: <input type="tel" maxlength="10" name="phoneNumber" id="phoneNumber" pattern="[789][0-9]{9}" placeholder="7339263883" required></label><br><br>
	<label>Email ID: <input type="email" name="emailId" id="emailId" pattern="[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,3}$" placeholder="raksha@gmail.com" required></label><br><br>
	<label>Password: <input type="password" name="password" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}" placeholder="Raksha@12" required></label><br><br>
	<button onclick="validation()">Submit</button>
</form>
<script type="text/javascript">
function validation()
{
	var name = document.getElementById("name");
	var phoneNumber = document.getElementById("phoneNumber");
	var emailId = document.getElementById("emailId");
	var password = document.getElementById("password");
	
	
	if (!name.checkValidity()) 
    {
        alert("Please enter a name in alphabets.");
        return;
    }
	
	if (!phoneNumber.checkValidity()) 
    {
        alert("Please enter a valid phone number.");
        return;
    }
	
	if (!emailId.checkValidity()) 
    {
        alert("Please enter a valid email address.");
        return;
    }

    if (!password.checkValidity())
    {
        alert("Please enter a valid password.\nPassword must contain at least 8 characters including at least one uppercase letter, one lowercase letter, and one number.");
        return;
    }
}
</script>
</body>
</html>
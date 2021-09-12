<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<form action="/public/saveuser" method="post">
	Username: <input type="text" name="username"/> <br>
		FirstName : <input type="text" name="firstName" /> <Br> Email :
		<input type="text" name="email" /> <Br> Password : <input
			type="text" name="password" /> <Br> <input type="submit"
			value="Signup" />
	</form>
</body>     
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<form action="../updateuser" method="post">
	<input type="hidden" name="userId" value="${user.userId}" />
		FirstName : <input type="text" name="firstName" value="${user.firstName}" /> <Br> Email :
		<input type="text" name="email" value="${user.email}" /> <Br>  <input type="submit"
			value="Update" />
	</form>
</body>
</html>
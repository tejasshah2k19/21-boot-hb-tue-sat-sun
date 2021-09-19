<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form method="post" action="login">
		Email: <input type="text" name="email"><br> Password: <input
			type="password" name="password" /><br> <input type="submit"
			value="Login" /> <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<br>
	<c:if test="${param.error != null}">
		Invalid Credentials
	</c:if>


	<c:if test="${param.logout != null}">
		you were successfully logged out from app
	</c:if>
	<br>

</body>
</html>




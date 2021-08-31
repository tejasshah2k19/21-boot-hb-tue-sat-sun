<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h2>List Users</h2>
	<a href="signup">Add More User </a>
	
	<table border="1">
		<thead>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>Action</th>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.userId}</td>
					<td>${user.firstName}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
					<td>${user.createdAt}</td>
					<Td>${user.updatedAt}</Td>
					<td> <a href="getuser/${user.userId}">  Edit </a> | <a href="deleteuser/${user.userId}"> Delete </a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
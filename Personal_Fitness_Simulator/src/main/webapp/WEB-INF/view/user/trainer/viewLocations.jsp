<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<div>
		<table style="width:50%">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email id</th>
				<th>Contact</th>
				<th>Gender</th>
				<th>Add Schedule</th>
				<th>View Schedule</th>
			</tr>
			<c:forEach items="${users}" var="user">
    			<tr>
					<td>${user.firstname}</td>
					<td>${user.lastname}</td>
					<td>${user.email}</td>
					<td>${user.contact}</td>
					<td>${user.gender}</td>
					<td><input type="submit" value="add schedule"></td>
					<td><input type="submit" value="view schedule"></td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
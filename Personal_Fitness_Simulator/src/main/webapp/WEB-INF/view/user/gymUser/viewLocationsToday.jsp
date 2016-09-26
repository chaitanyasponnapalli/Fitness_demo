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
				<th>Schedule Date</th>
				<th>Diet</th>
				<th>Exercise</th>
			</tr>
			<c:forEach items="${user_schedule}" var="schd">
    			<tr>
					<td>${schd.date}</td>
					<td>${schd.diet}</td>
					<td>${schd.exercise}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
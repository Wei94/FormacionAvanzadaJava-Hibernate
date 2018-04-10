<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="es">
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	margin: auto;
	max-width: 768px;
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
	max-width: 768px;
}
</style>
</head>
<body>
	<div>
		<form action="/demo/">
			<input type="submit"
				value="Click on this button to return to main page">
		</form>
		<br>
		<table>
			<tr>
				<th>Country</th>
			</tr>
			<tr>
				<c:forEach items="${Ciudades}" var="ciudades" varStatus="status">
					<tr>
						<td>${ciudades}</td>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="es">
<style>
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
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
<body bgcolor= "#f2f2f2">
	<div>
		<div>
			<form action="/demo/all">
				<input type="submit" value="Click on this button to see all users">
			</form>
			<br>

			<form action="/demo/add">
				Name:<br> <input type="text" name="name" value="Mickey">
				<br> Email:<br> <input type="text" name="email"
					value="Mouse@disney.com"> <br> Country:<br> <input
					type="text" name="pais" value="Spain"> <br> <br>
				<input type="submit" value="Insert new user">
			</form>
			<br>
			<form action="/demo/find">
				Name:<br> <input type="text" name="name" value="Mickey">
				<br> <br> <input type="submit" value="Find user">
			</form>
			<br>
			<form action="/demo/addCity">
				City:<br> <input type="text" name="ciudad" value="Zgz">
				<br> Country:<br> <input type="text" name="pais"
					value="Spain"> <br> Language:<br> <input
					type="text" name="idiomaHabla" value="Spanish"> <br> <br>
				<input type="submit" value="Insert new city">
			</form>
			<br>
			<form action="/demo/findCities">
				Name:<br> <input type="text" name="name" value="Mickey">
				<br> <br> <input type="submit"
					value="Find possible cities">
			</form>

		</div>
	</div>
</body>
</html>
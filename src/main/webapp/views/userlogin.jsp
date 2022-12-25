<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center"">
		<h1>Please Login</h1>
		<form action="/login" method="POST">
			<table style="with: 80%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
					<br>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="password" name="password" /></td>
				</tr>
			</table>
			<input type="submit" value="Login" />
			<p class="text">
				Don't have an account? <a href="">Register</a>
			</p>

     	</form>
	</div>
</body>
</html>
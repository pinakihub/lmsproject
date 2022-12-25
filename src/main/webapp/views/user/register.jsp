<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Registration Form</h1> 
<form action="/userregister"  method="post">  
<p>${msg}</p>
<table style="with: 80%">

<tr>
					
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				<tr>
					  <td>Department</td> 
					<td><select name="department" >
                     	<option>IT</option>
					<option>CSE</option>
					<option>ECE</option>
					<option>CE</option>
					<option>ME</option>
					</select></td>
				</tr>
				<tr>
					<td>Batch</td>
					<td><input type="text" name="batch" /></td>
				</tr>
				
				<tr>
					<td>Role</td>
					<td><select name="role" >
                     	<option>STUDENT</option>
					<option>TEACHER</option>
					
					</select></td>
					</tr>
					
					
					
				</table>
<input type="submit" value="Register">

</form> 
</div> 
</body>
</html>
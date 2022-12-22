<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin login</title>
<link href="/styles/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">
        <h1>Please login</h1>
        <form action="/doadminlogin" method="POST">
            <div class="form-control">
                <input type="text" required>
                <label >Email</label>
            </div>
            <div class="form-control">
                <input type="password" required>
                <label >password</label><br>

                <button class="btn">Login </button>         
      		<p class="text">
                    Don't have an account? <a href="">Register</a>
                </p>
             </div>
        </form>
    </div>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin register</title>
<link href="/styles/style.css" rel="stylesheet">
</head>
<body>
	<p> ${msg} </p>
	<div class="container">
        <h1>Please Register</h1>
        <form action="/doadminregister" method="POST">
            <div class="form-control">
                <input type="text" name="adminName" required>
                <label >Name</label>
            </div>
            <div class="form-control">
                <input type="text" name="adminEmail" required>
                <label >Email</label>
            </div>
            <div class="form-control">
                <input type="text" name="adminContact" required>
                <label >Contact</label>
            </div>
            <div class="form-control">
                <input type="password" name="adminPassword" required>
                <label >Password</label><br>

                <button class="btn">Register </button>         
      <p class="text">
                    Already have an account? <a href="">Login</a>
                </p>
             </div>
        </form>
    </div>
</body>
</html>
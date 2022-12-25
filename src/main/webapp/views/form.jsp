<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/styles/bookform.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<p>${msg}</p>
	
		<h2>Add New Book</h2>
		<form action="/books/doaddbook" method="POST">

			<div class="row100">
				<div class="col">
					<div class="inputBox">
						<input type="number" name="bookId" required="required"> <span
							class="text">Book Id</span> <span class="line"></span>
					</div>
				</div>
				<div class="col">
					<div class="inputBox">
						<input type="text" name="bookTitle" required="required"> <span
							class="text">Book Title</span> <span class="line"></span>
					</div>
				</div>
			</div>
			<div class="row100">
				<div class="col">
					<div class="inputBox">
						<input type="text" name="bookAuthor" required="required">
						<span class="text">Book Author</span> <span class="line"></span>
					</div>
				</div>
				<div class="col">
					<div class="inputBox">
						<input type="number" name="bookCount" required="required"> <span
							class="text">Book Count</span> <span class="line"></span>
					</div>
				</div>
			</div>
			<div class="row100">
				<div class="col">
					<div class="inputBox">
						<input type="text" name="bookSubject" required="required">
						<span class="text">Book Subject</span> <span class="line"></span>
					</div>
				</div>
				<div class="col">
					<div class="inputBox">
						<input type="text" name="bookGenre" required="required"> <span
							class="text">Book Genre</span> <span class="line"></span>
					</div>
				</div>
			</div>
			
			<div class="row100">
				<div class="col">
					<input type="submit" >
				</div>
			</div>
		</form>
	</div>
</body>
</html>
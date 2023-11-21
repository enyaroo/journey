<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>Journey</title>
        
        <!-- bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

		<link rel="stylesheet" type="text/css" href="/static/css/style.css">
	</head>
	<body>
		<div class="container">
			<section>
				<div class="d-flex justify-content-center">
					<div class="login-box w-50">
						<h2>로그인</h2>
						<form id="loginForm" action="/user/sign-in" method="post">
							<h6>ID</h6>
							<input type="text" class="form-control" id="loginId" name="loginId">
							<h6>PASSWORD</h6>
							<input type="password" class="form-control" id="password" name="password">
							<input type="submit" id="loginBtn" class="btn btn-block" value="login">
							<a href="#">암호를 잊으셨습니까?</a>
							<a href="/user/sign-up-view">회원가입</a>
						</form>
					</div>				
				</div>
			</section>
			<footer class="d-flex justify-content-center align-items-center">
				<div class="text-muted">Journey © 2023</div>
			</footer>
		</div>
	</body>
</html>
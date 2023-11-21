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
					<div class="sign-up-box w-50">
						<h2>회원가입</h2>
						<form id="signUpForm" action="/user/sign-up" method="post">
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text border-right-0 bg-white">ID</span>
								</div>
								<input type="text" id="loginId" name="loginId" class="form-control border-left-0">
							</div>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text border-right-0 bg-white">PASSWORD</span>
								</div>
								<input type="password" id="password" name="password" class="form-control border-left-0">
							</div>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text border-right-0 bg-white">USERNAME</span>
								</div>
								<input type="text" id="userName" name="userName" class="form-control border-left-0">
							</div>
							<input type="submit" id="signUpBtn" class="btn btn-block" value="가입하기">
							<a href="#">계정이 있으신가요?</a>
							<a href="/user/sign-in-view">로그인</a>
						</form>
					</div>				
				</div>
			</section>
			<footer class="d-flex justify-content-center align-items-center">
				<div class="text-muted">Journey © 2023</div>
			</footer>
		</div>
	<script>
	$(document).ready(function() {
		// 회원가입 submit
		$('#signUpForm').on('submit', function(e) {
			let loginId = $('#loginId').val().trim();
			let password = $('#password').val();
			let userName = $('#userName').val().trim();
			
			// AJAX로 보내기
			let url = $(this).attr('action');
			let params = $(this).serialize();
			console.log(params);
			
			$.post(url, params)
			.done(function(data) {
				if (data.code == 200) {
					alert("가입되었습니다. 로그인해주세요.")
					location.href = "user/sign-in-view";
				} else {
					alert(data.errorMessage);
				}
			});
		});
	});
	</script>
	</body>
</html>
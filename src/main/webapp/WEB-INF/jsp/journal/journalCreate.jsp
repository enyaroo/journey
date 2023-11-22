<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <title>Journey</title>
        
        <!-- bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

		<link rel="stylesheet" type="text/css" href="/static/css/style.css">
    </head>
	<body>
		<div class="container">
			<div>Username님 오늘 게임은 어떠셨어요? Journal을 기록해 보세요.</div>
			<form id="journalCreateForm" method="post" action="/journal/create">
				<input type="text" id="title" name="title" class="form-control" placeholder="제목을 입력하세요.">
				<div class="d-flex justify-content-between">
					<div class="small">GameName 플레이 시간 동안 N개의 screenshot이 생성되었습니다<br>Journal에 추가해 볼까요?</div>
					<button class="btn btn-secondary">이미지 추가하기</button>
				</div>
				<div class="d-flex justify-content-between">
					<div class="small">GameName 플레이 시간 동안 N개의 video가 생성되었습니다<br>Journal에 추가해 볼까요?</div>
					<button class="btn btn-secondary">동영상 추가하기</button>
				</div>
				<textarea id="body" name="body" class="form-control" placeholder="내용을 입력하세요."></textarea>
				<div>
					<button class="btn btn-secondary">나가기</button>
					<button id="journalCreateBtn" class="btn btn-primary">저장하기</button>
				</div>
			</form>
		</div>
	
	<script>
	$(document).ready(function() {
		$('#journalCreateForm').on('submit', function(e) {
			e.preventDefault();
			alert("클릭");
			
			let title = $('#title').val();
			let body = $('#body').val();
			
			let url = $(this).attr('action');
			let params = $(this).serialize();
			
			$.post(url, params)
			.done(function(data) {
				if (data.code == 200) {
					alert("journal이 저장되었습니다.");
					location.href="/journal/journal-list-view"
				} else {
					alert(data.errorMessage);
				}
			});
		});
	});
	</script>	
	</body>
</html>
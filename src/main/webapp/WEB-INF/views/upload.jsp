<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
</head>
<body>
<form method="POST" action="/upload" enctype="multipart/form-data">
	제목 <input type="text" id="title" name="title"><br>
	이름 <input type="text" id="name" name="name"><br>
	리포트 파일 <input type="file" id="file" name="file"><br>
<button>리포트 전송</button>	
</form>

</body>
</html>
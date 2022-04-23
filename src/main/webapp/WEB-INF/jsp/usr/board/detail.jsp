<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 상세페이지</title>
</head>
<body>
	<h1>게시물 상세페이지</h1>
		<div>
			번호 : ${article.id}
			<br />
			제목 : ${article.title}
			<br />
			내용 : ${article.body}
		</div>
</body>
</html>
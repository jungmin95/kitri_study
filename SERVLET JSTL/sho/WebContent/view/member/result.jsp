<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
${sessionScope.id }님 로그인 성공<br>
<a href="${pageContext.request.contextPath }/SearchController">내 정보 수정</a><br>
<a href="${pageContext.request.contextPath }/LogoutController">로그아웃</a><br>
<a href="${pageContext.request.contextPath }/DelController">탈퇴</a><br>
<a href="${pageContext.request.contextPath }/seller/List">쇼핑몰</a><br>
</body>
</html>
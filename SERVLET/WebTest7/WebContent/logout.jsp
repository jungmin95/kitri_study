<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>로그아웃 되었습니다</h3>
<%
//session.removeAttribute("result");
//session.removeAttribute("id");
session.invalidate();
%>
<a href="loginResult.jsp">loginResult.jsp로 이동</a>

</body>
</html>
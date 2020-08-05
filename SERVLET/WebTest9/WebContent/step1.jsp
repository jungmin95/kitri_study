<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>	Hello jsp!</title>
</head>
<body>
	<!--  JSP 주석 -->
	<%
		//자바 주석
	int i;
	for(i = 1; i <6; i++) {
		
	
	%>
	<h<%=i %>>hello</h<%=i%>>
	<%
	}
	%>
</body>
</html>
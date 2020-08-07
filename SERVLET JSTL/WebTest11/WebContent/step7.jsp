<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	pageContext.setAttribute("data", "pageContext]");
	request.setAttribute("data", "request");
	session.setAttribute("data", "session");
	application.setAttribute("data", "application");
	%>
	
	현재 프로그램의 기본 경로 : ${pageContext.request.contextPath } <br><br>
	파라메터 name : ${param.name }<br>
	파라메터 age : ${param.age }<br><br>
	
	scope 지정하지 않았을때 data 값 : ${data } <br><Br>
	
	scope를 pageContext로 지정했을때의 data값 ${pageScope.data }<br><br>
	scope를 request 지정했을때의 data값 ${requestScope.data }<br><br>
	scope를 session로 지정했을때의 data값${sessionScope.data }<br><br>
	scope를 application로 지정했을때의 data값${applicationScope.data }
</body>
</html>
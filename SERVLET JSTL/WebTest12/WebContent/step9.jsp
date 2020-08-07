<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>redirect 예쩨</h3>
	<c:url var="url" value="step10.jsp"/>
	<c:redirect url="${url }">
		<c:param name="name" value="tom" />
		<c:param name="age" value="14" />
	</c:redirect>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/view/member/result.jsp">내정보</a>
	<br>
	<h3>전체 상품</h3>
	<table border="1">
		<tr>
			<th>상품 이미지</th>
			<th>상품명</th>
			<th>가격</th>
		</tr>
		<c:forEach var="p" items="${products }">
			<tr>
				<td><img src="${p.img }" width="50" height="50"></td>
				<td><a
					href="${pageContext.request.contextPath }/seller/detail?num=${p.num }">${p.name }</a>
				<td>${p.price }</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
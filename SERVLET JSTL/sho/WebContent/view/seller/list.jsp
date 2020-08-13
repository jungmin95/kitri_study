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
	<h3>내가 등록 한 상품</h3>
	<a href="${pageContext.request.contextPath }/seller/addForm">새 상품
		등록</a>
	<br>
	<table border="1">
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
		</tr>
		<c:forEach var="p" items="${products }">
			<tr>
				<td>${p.num }</td>
				<td><a
					href="${pageContext.request.contextPath }/seller/detail?num=${p.num }">${p.name }</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
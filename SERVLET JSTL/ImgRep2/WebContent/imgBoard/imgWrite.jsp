<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>이미지 올리기</h3>
	<%-- <form action="${pageContext.request.contextPath }/WriteController" method="post" enctype="multipart/form-data"> --%>
	<!-- 	제목 : <input type="text" name="title"><br> -->
	<!-- 	게시자 : <input type="text" name="writer"><br> -->
	<!-- 	이미지 : <input type="file" name="path"><br> -->
	<!-- 	<input type="submit" value="올리기"> -->
	<!-- </form> -->

	<form action="${pageContext.request.contextPath }/WriteController"
		method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>게시자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><input type="file" name="path"></td>
			</tr>
			<tr>
				<td><input type="submit" value="올리기"></td>
			</tr>

		</table>
	</form>

</body>
</html>
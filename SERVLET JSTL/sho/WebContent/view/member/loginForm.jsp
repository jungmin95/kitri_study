<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>로그인</h3>
<form name="f" action="${pageContext.request.contextPath }/LoginController" method="post">
	<table border="1">
		<tr>
		<td>id</td><td><input type="text" name="id">
		</tr>
		<tr>
			<td>pwd</td><td><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td><input type="submit" value="로그인"></td>
			<td><a href="${pageContext.request.contextPath }/view/member/form.jsp">회원가입</a></td>
		</tr>
		
		
	
	</table>

</form>

</body>
</html>
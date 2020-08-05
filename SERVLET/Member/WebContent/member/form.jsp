<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>join</h3>
<form action="<%=request.getContextPath()%>/JoinController" method="post">
	id : <input type="text" name="id"><br />
	pwd: <input type="password" name="pwd"> <br/>
	name:<input type="text" name="name"><br />
	email:<input type="text" name="email"><br />
	<input type="reset" value="취소">
	<input type="submit" value="가입"> <br/>

</form>
</body>
</html>
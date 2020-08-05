<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	public void jspInit() {
	Member m = new Member("id1", "pwd2", "name1", "email1");
	ServletContext context = getServletContext();
	context.setAttribute("m",m);
}

%>
<h3>jspInit() 메서드에 생성한 객체</h3>
<%
	Member m = (Member) application.getAttribute("m");
out.print("id: " + m.getId() + "<br>");
out.print("id: " + m.getPwd() + "<br>");
out.print("id: " + m.getName() + "<br>");
out.print("id: " + m.getEmail() + "<br>");
%>
</body>
</html>
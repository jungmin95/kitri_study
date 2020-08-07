<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="model.Member" %>
    <%@ page import ="java.util.Map, java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String[] strings = {"aaa", "bbb", "ccc"};

	ArrayList<Member> members = new ArrayList<Member>();
	members.add(new Member("id1", "111", "name1", "email1"));
	members.add(new Member("id2", "222", "name2", "email2"));
	members.add(new Member("id3", "333", "name3", "email3"));
	
	Map<String, String> map = new HashMap<String, String>();
	map.put("name", "xxx");
	map.put("tel", "111");
	map.put("address", "대한민국");
	
	

%>

	<c:set var="strings" value="<%=strings %>" />
	<c:set var="members" value="<%=members %>" />
	<c:set var="map" value="<%=map %>" />
	
	*1 ~ 5출력<br><hr>
	<c:forEach var="i" begin="1" end="5">
		${i },
	</c:forEach>
	<br><hr>
	
	*1~5사이의 숫자를 2씩 증가하여 출력
	<c:forEach var="i" begin="1" end="5" step="2">
		${i },
	</c:forEach>
	<br><hr>
	
	*String[]에 저장된 데이터 출력<br>
	<c:forEach var="s" items="${strings}">
		${s },
	</c:forEach>
	<br><hr>
	
	*ArrayList에 저장된 데이터 출력<br>
	<c:forEach var="m" items="${members }">
		id:${m.id} pwd:${m.pwd } name:${m.name } email:${m.email }<br>
	</c:forEach>
	
	*Map에 저장된ㄷ ㅔ이터 출력<br>
	<c:forEach var="m" items="${map }">
		${m },
	</c:forEach>
	
	
</body>
</html>
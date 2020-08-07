<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO, java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
1. scriptlet로 회원정보 출력하기 <br>
<%MemberVO vo = (MemberVO)session.getAttribute("mvo"); %>
아이디 : <%=vo.getId() %> 이름 : <%=vo.getName() %> 주소 : <%=vo.getAddress() %><br>

2. el로 회원벙보를 출력 <br>
아이디 : ${sessionScope.mvo.id }
이름 : ${sessionScope.mvo.name }
주소 : ${sessionScope.mvo.address } <br>
<!--  ${mvo.address}도 수행은 된다.왜 ? ㅏㄱ 세션을 검색하므로 -->

<% String[] names=(String[])session.getAttribute("names"); %>

3.배열 출력 scriptlet<br>
<%=names[0] %>, <%=names[1] %>, <%=names[2] %><br>

4. 배열출력 el<br>
${sessionScope.names[0]},${sessionScope.names[1]},${sessionScope.names[2]}<br>

<%
	HashMap map = (HashMap)session.getAttribute("memMap");
	MemberVO vo1=(MemberVO)map.get("mem1");
	MemberVO vo2=(MemberVO)map.get("mem2");
%>

5. HashMap출력 scriptlet<br>
map key : mem1 정보 이름:<%=vo1.getName() %> 주소 : <%=vo1.getAddress() %><br>
map key : mem2 정보 이름:<%=vo2.getName() %> 주소 : <%=vo2.getAddress() %><br>

6. HashMap출력 el<br>
map key : mem1정보 이름:${sessionScope.memMap.mem1.name }
map key : mem2정보 이름:${sessionScope.memMap.mem2.name }
<hr>
</body>
</html>
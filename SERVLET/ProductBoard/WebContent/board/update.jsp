<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import ="model.ProductVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	ProductVO m = (ProductVO)request.getAttribute("m");
%>
<form action ="<%=request.getContextPath()%>/control?pno=<%=m.getPno()%>" method="post">
	<input type="hidden" name="Type" value="edit">
	상품 이름 : <input type="text" name="pname" value="<%=m.getPname()%>">
	상표  : <input type="text" name="pmaker" value="<%=m.getPmaker() %>">
	상품가격 : <input type="text" name="pprice" value="<%=m.getPprice() %>">
	상세정보 : <input type="text" name="pdetail" value="<%=m.getPdetail() %>">
	
	<input type="submit" value="수정"> 

</form>
</body>
</html>
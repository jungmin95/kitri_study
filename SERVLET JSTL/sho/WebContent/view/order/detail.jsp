<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function a(price){
		var sel = f.quantity.options[f.quantity.selectedIndex].value;
		var q = parseInt(sel);
		var total = q*price;
		f.total_price.value = total;
	}
	function b() {
		f.o_state.value="1";
		f.submit()
	}
</script>
</head>
<body>
<form name="f" action="${pageContext.request.contextPath }/order/add" method="post">
	<table border="1">
		<tr>
			<th>상품명</th><td>${p.name }</td>
			
		</tr>
		<tr>
			<th>가격</th><td>${p.price }</td>
		</tr>
		<tr>
			<th>주문수량</th><td><select name="quantity" onchange="a(${p.price })">
				<option value="0">수량선택</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select>
			</td>
		</tr>
		<tr>
		<th>결제금액</th><td><input type="text" name="total_price"></td>
		</tr>
		<tr>
			<th>상품 이미지</th><td><img src="${p.img }" width="300" height="300"></td>
		</tr>
		<tr>
			<th>상품 상세설명</th><td>${p.content }</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="즉시주문">
			<input type="button" value="즉시 주문" onclick="b()"></td>
			
		</tr>
	</table>
	<input type="hidden" name="num" value="${p.num }">
	<input type="hidden" name="o_state" value="0">
</form>
</body>
</html>
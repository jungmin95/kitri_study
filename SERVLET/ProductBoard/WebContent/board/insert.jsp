<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function checkInsert(r) {
		if(r.pname.value==""){
			alert("상품명을 입력하세요");
			r.pname.focus();
			return;
		}else if(r.pmaker.value==""){
			
			alert("제조사를 입력하세요");
			r.pmaker.focus();
			return;
		}else if(r.pprice.value==""){
			
			alert("가격을 입력하세요");
			r.pprice.focus();
			return;
		}else if(r.pdetail.value==""){
			
			alert("상세 정보를 입력하세요");
			r.pdetail.focus();
			return;
		}
		r.submit();
		
	}
</script>
</head>
<body>
<form name="x" action="<%=request.getContextPath()%>/control?type=insert" mehtod="post">
	<table>
		<tr>
		<td>상품명 : <input type="text" name="pname"><br><br></td>
		</tr>
		<tr>
		<td>제조사 : <input type="text" name="pmaker"><br><br></td>
		</tr>
		<tr>
		<td>가 격 : <input type="text" name="pprice"></td>
		</tr>
		<tr>
		<td>상세 정보 : <textarea rows="5" cols="40" name="pdetail"></textarea></td>
		</tr>
		
	</table>
	<input type="button" onclick="checkInsert(this.form)" value="상품입력">
</form> 


</body>
</html>
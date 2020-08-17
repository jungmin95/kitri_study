<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>  
 <script type="text/javascript">
 $(document).ready(function() {   
	 $('#submit').click(function () {      
	 $.ajax({
	 type:"GET",
	 url:"drinkinfo.json",    
	 dataType:"json",
	 success: function (data) {   
	 var drinks="<ul>";
	 $.each(data, function(i,n){
	 drinks+="<li>"+n["optiontext"]+"</li>";
	 });
	 drinks+="</ul>";              
	 $('#message').append(drinks);	
	 }
	 });   
	 return false;	
	 });		
	 });

</script>

</head>
<body>
<p>For information from JSON file click the button given below :<br>
<input type="submit" id="submit"/>  
<div id="message"></div>
</body>
</html>
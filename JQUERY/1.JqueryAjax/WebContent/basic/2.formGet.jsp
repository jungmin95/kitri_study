<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript">
</script>  
 <script type="text/javascript">
 $(document).ready(function() {   
	 
	  $('#b1').click(function () {
		  var name = $('.uname').val();
		  var data = 'uname=' + name;  
		  alert(data);
		  
		    $.ajax({
		        
		    	type:"GET",
		    	url:"/1.JqueryAjax/WelcomeServlet2",
		        //url:"welcome.jsp",    
		        
		        data: data,        
		        success: function (data) {                 
		         $('body').text(data);
		        }
		    });
	  });
 });
  
 </script>
</head>
<body>
<form>
<label>Enter your Name</label>  
    <input type="text" name="uname" class="uname"/>  <br/>
    <input type="button" id="b1" value="click"/>  
  </form>  
  
</body>
</html>




<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
  $(function(){
	
	   $("button").click(function(){
		    document.location.href='${pageContext.request.contextPath}/'+this.id;
		}); 	 
  });
</script>
</head>
<body>
<button id="index">HOME</button><button id="message">Message</button><button id="lesson">JAVA</button>
<br>
<form action="${pageContext.request.contextPath}/empValue" method="post">
   <input type="text" name="job">
   <input type="text" name="sal">
   <input type="submit" value="Send">
</form>

<form action="${pageContext.request.contextPath}/lessonCheck" method="post">
   <input type="checkbox" name="lesson" value="java">Java
   <input type="checkbox" name="lesson" value="mysql">mysql
   <input type="checkbox" name="lesson" value="html">html
   <input type="checkbox" name="lesson" value="spring">spring
   <input type="submit" value="Send">
</form>

</body>
</html>




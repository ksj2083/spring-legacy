<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LessonCheckView</h1>
<c:forEach var="i" items="${chValue}">
    <c:out value="${i}"></c:out><br>
</c:forEach>
</body>
</html>
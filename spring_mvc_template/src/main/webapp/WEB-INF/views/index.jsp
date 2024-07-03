<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>
		Welcome to Spring MVC!!!!!
	</h5>
	<h5>
	<c:url var="url" value="/test/multiply?num1=09&num2=09" />
	<a href="${url}">Test Model Map with Request Parameter</a>	
	</h5>
	<h5>
	<c:url var="url" value="/posts/view?categoryName=a1" />
	<a href="${url}">Test Model Map with Request Parameter</a>
	</h5>
	<h5>
	<c:url var="url" value="/poststitle/viewtitle?title=title1" />
	<a href="${url}">list by title</a>
	</h5>
</body>
</html>
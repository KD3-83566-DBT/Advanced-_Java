<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Welcome 2 Spring Boot @ ${requestScope.ts}</h4>
	<h5>
		<c:url var="url" value="/user/login" />
		<a href="${url}">User Login</a>
	</h5>
</body>
</html>
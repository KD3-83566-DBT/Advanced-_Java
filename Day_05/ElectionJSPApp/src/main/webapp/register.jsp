<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="rb" class="com.sunbeam.beans.RegistrationBean"
		scope="page" />
	<jsp:setProperty name="rb" property="*" />
	<%
	rb.registerUser();
	%>
	<c:choose>
		<c:when test="${rb.count == 1}">
			Registration successful.
			<a href="index.html">Sign In</a>
		</c:when>
		<c:otherwise>
			Registration failed.
			<a href="newuser.jsp">Sign Up</a>
		</c:otherwise>
	</c:choose>
</body>
</html>
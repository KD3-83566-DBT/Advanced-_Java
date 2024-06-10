<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class="com.sunbeam.Javabeans.register"/>
<jsp:setProperty name="lb" property="firstName" param="first_name"/>	
<jsp:setProperty name="lb" property="lastName" param="last_name"/>
<jsp:setProperty name="lb" property="email" param="email"/>	
<jsp:setProperty name="lb" property="DOB" param="date"/>
<jsp:setProperty name="lb" property="password" param="passwd"/>
<% lb.reg();%>
<input type="submit" value=Submit>
</body>
</html>
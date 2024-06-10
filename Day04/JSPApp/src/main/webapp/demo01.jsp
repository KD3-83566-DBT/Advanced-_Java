<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Frist Program</title>
</head>
<body>
<h1>JSP Syntax</h1>
<%!
int count=0;
public void jspInit(){
	System.out.println("demo01 jspinit() called");
}
public void jspDestroy(){
	System.out.println("demo01 jspDistroy() called");
}
%>

<%
Date date= new Date();
out.println("server Time:"+ date);
%>
<br><br/>
<%count++; %>
<%if(count %2 ==2 ){ %>
Event count: <%=count %>
<%} else { %>
Odd count: <%=count %>
<%} %>
<br/><br/>
	<%
		if(count % 2 == 0)
			out.println("Even Count: " + count);
		else
			out.println("Odd Count: " + count);
	%>
</body>
</html>
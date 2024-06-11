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
<div style="background-color:beige">
<center>
<jsp:useBean id="res" class="com.sunbeam.beans.CandidateListBean"></jsp:useBean>
${ res.fetchCandidates()}
<table border="1">
<thead>
<tr>
<th>ID</th>
<th>Name</th>
<th>Party</th>
<th>Votes</th>
<th>Edit</th>
<th>Delete</th>
<tr/>
<thead/>
<tbody>
<c:forEach var="c" items="${res.getCandidateList()}">
<tr>
<td>${c.id}</td>
<td>${c.name}</td>
<td>${c.party}</td>
<td>${c.votes}</td>
<td><a href="editcand.jsp?id=${c.id}">Edit</a><td/>
<td><a href="delcand.jsp?id=${c.id}">Delete</a><td/>
</tr>
</c:forEach>
</tbody>
</table>
<br>
<a href='logout.jsp'>Sign Out</a>
<br/>
<br>
<img src="images/flag.jpg" alt="Edit" width="400" height="200"/>
<h1> Vote for India</h1>
<center/>
</center>
<div/>
</body>
</html>
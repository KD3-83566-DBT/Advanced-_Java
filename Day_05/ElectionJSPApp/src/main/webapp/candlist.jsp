<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate List</title>
</head>
<body>
<div style="background-color:beige">
<center>
<h2>${initParam.appTitle}</h2>
	Hello, ${lb.user.firstName} ${lb.user.lastName} <hr/>
	<jsp:useBean id="clb" class="com.sunbeam.beans.CandidateListBean"/>
	${ clb.fetchCandidates() }
	<form method="post" action="vote.jsp">
		<c:forEach var="c" items="${clb.candidateList}">
			<input type="radio" name="candidate" value="${c.id}"/> ${c.name} - ${c.party} <br/>
		</c:forEach>
		<br/> <input type="submit" value="Vote"/>
		<br><br/>
<img src="images/flag.jpg" alt="Edit" width="400" height="200"/>
<h1> Vote for India</h1>
	</form>
<center/>
<div/>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Candidate</title>
</head>
<body>
<body>
<center>
<div style="background-color:beige ">
<h1>Online Voting</h1>
	<h3>${initParam.appTitle}</h3>
	<jsp:useBean id="fcb" class="com.sunbeam.beans.FindCandidateBean"/>
	<jsp:setProperty name="fcb" property="id" param="id"/>
	${ fcb.fetchCandidate() }
	<form method="post" action="updatedcand.jsp">
		<input type="hidden" name="id" value="${fcb.candidate.id}"/>
		Name: <input type="text" name="name" value="${fcb.candidate.name}"/> <br/><br/>
		Party: <input type="text" name="party" value="${fcb.candidate.party}"/> <br/><br/>
		Votes: <input type="text" name="votes" value="${fcb.candidate.votes}" readonly="readonly"/> <br/><br/>
		<input type="submit" value="Update Candidate"/>
		<br><br/>
<img src="images/flag.jpg" alt="Edit" width="400" height="200"/>
<h1> Vote for India</h1>
</form>
</center>
</body>
</html>
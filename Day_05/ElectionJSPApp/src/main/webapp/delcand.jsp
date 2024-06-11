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
<jsp:useBean id="del" class="com.sunbeam.beans.DeleteCandidate"></jsp:useBean>
<jsp:setProperty name="del" property="id" param="id"/>
${ del.deleteCan()}
<c:redirect url="result.jsp" />
</body>
</html>
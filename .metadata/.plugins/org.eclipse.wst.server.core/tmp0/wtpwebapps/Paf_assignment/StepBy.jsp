<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("username");
	session.setAttribute("un",username);
	String redirectURL = "http://localhost:8081/Paf_assignment/Homepage.jsp";
	response.sendRedirect(redirectURL);
%>
</body>
</html>
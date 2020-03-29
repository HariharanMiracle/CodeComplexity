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
String name = request.getParameter("name");
session.setAttribute("un",name);
String redirectURL = "http://localhost:8081/PAF/Home.jsp";
response.sendRedirect(redirectURL);
%>
</body>
</html>
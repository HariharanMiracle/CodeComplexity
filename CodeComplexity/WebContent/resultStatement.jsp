<%@page import="com.codeComplexity.model.SingleLineStatement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<SingleLineStatement> lines = (List<SingleLineStatement>)request.getAttribute("statementList"); %>
	<h1>Results</h1>
	<%
		for(SingleLineStatement line : lines){
			%>
				<p>######################################################################</p>
				<p>Line Number => <%=line.getLineNumber() %></p>
				<p>Statement => <%=line.getStatement() %></p>
				<p>Weight => <%=line.getCs() %></p>
				<p>######################################################################</p>	
			<%
		}
	%>
</body>
</html>
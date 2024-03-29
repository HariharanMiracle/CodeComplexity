<%@page import="com.codeComplexity.model.SingleLineMethods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
#tab-01 {
  border-collapse: collapse;
  width: 100%;
}

#tab-01 td, #tab-01 th {
  border: 1px solid #ddd;
  padding: 8px;
}

#tab-01 tr:nth-child(even){background-color: #f2f2f2;}

#tab-01 tr:hover {background-color: #ddd;}

#tab-01 th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #a3a3a3;
  color: white;
}
</style>
</head>
<body>
	<% List<SingleLineMethods> lines = (List<SingleLineMethods>)request.getAttribute("statementList"); %>
	<h1>Code Complexity due to Methods</h1>
	<table id="tab-01">
	<tr>
		<th>Line No</th>
		<th>Program Statements</th>
		<th>WMRT</th>
		<th>Npdtp</th>
		<th>Ncdtp</th>
		<th>Cm</th>
	</tr>
	<%
		for(SingleLineMethods line : lines){
			%>
				<tr>
				<td><%=line.getLineNumber() %></td>
				<td><%=line.getStatement() %></td>
				<td><%=line.getWmrt() %></td>
				<td><%=line.getNpdtp() %></td>
				<td><%=line.getNcdtp() %></td>
				<td><%=line.getCm() %></td>
				</tr>
			<%
		}
	%>
	</table>
</body>
</html>
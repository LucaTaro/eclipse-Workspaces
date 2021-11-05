<%@page import="model.Gatto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I nostri gatti</title>
</head>
<body>

<h1>I nostri gatti</h1>
<ul>
<%
	ArrayList<Gatto> gatti = (ArrayList<Gatto>) request.getAttribute("gatti");
	for(Gatto g : gatti) {
%>
<li> <%= g %></li>
<% } %>
</ul>
</body>
</html>
<%@page import="model.Bicicletta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String s = "ciao java";
		for(int i = 1; i < 7; i++) {
			out.print("<h" + i + ">");
			out.print(s);
			out.print("</h" + i + ">");
		}
		Bicicletta b = new Bicicletta();
				
	%>
	<h1><%= b.colore %></h1>
</body>
</html>
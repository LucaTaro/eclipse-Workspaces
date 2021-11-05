<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
	<h1>Sono result.jsp scemooooooooooooooooooooo</h1>
	<%
		ArrayList<String> cose = (ArrayList<String>) session.getAttribute("todolist");
		for(String c : cose) {
			out.print("<li>");
			out.print(c);
			out.print("</li>");
		}
	%>
</ul>
</body>
</html>
<%@page import="model.Libro"%>
<%@page import="dao.LibroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>

	<%
	LibroDAO ld = new LibroDAO();
	ld.getLibri();
	
	for (Libro l : ld.getLibri()) {
		%>
			<tr>
				<td><a href="dettaglio.jsp?libroCercato=<%= l.getId() %>">
					<%= l.getTitolo() %>
				</a></td>					
			</tr>
		<%
	}
	%>
	
	</table>

</body>
</html>
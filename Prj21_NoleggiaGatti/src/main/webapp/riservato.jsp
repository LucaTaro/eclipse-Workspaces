<%
if(session.getAttribute("userLogged") != null) {
} else {
	response.sendRedirect("index.jsp");
}
%>
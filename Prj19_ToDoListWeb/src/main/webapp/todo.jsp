	<%@page import="java.util.ArrayList"%>
<%
		String cosa = request.getParameter("cosaDaInserire");
		//out.print(cosa);
		ArrayList<String> cose;
		if(session.getAttribute("todolist") != null) {
			cose = (ArrayList<String>) session.getAttribute("todolist");
		} else {
			cose = new ArrayList<>();
			
		}
		cose.add(cosa);
		session.setAttribute("todolist", cose);
		response.sendRedirect("result.jsp");
	%>
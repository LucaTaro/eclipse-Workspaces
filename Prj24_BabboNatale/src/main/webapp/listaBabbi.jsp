<%@page import="dao.BabboDAO"%>
<%@page import="dao.BabboDAOImpl"%>
<%@page import="model.Babbo"%>
<%@page import="java.util.ArrayList"%>

<table>
	<thead>Elenco babbo natale</thead>
		<tr>
			<th>Nome</th>
			<th>Mezzo di trasporto</th>
			<th>Zona</th>
		</tr>
		<%
		BabboDAOImpl bd = new BabboDAOImpl();
		for(Babbo b : bd.getBabbi()) {
			
		%>
		<tr>
			<td><%= b.getNomeDaBabbo() %></td>
			<td><%= b.getMezzo() %></td>
			<td><%= b.getZona() %></td>
		</tr>
		
		<%} %>
</table>

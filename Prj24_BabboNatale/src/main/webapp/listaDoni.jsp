<%@page import="model.Dono"%>
<%@page import="dao.DonoDAOImpl"%>

<table>
	<thead>Elenco doni</thead>
		<tr>
			<th>Dono</th>
			<th>Disponibilità</th>
		</tr>
		<%
		DonoDAOImpl bd = new DonoDAOImpl();
		for(Dono d : bd.getDoni()) {
			
		%>
		<tr>
			<td><%= d.getDescrizione() %></td>
			<td><%= d.getDisponibilita() %></td>
		</tr>
		
		<%} %>
</table>

<%@page import="model.Prodotto"%>
<%@page import="java.util.ArrayList"%>
<h1>${titolo}</h1>
<table>
  <tr>
    <th>Prodotto</th>
    <th>Prezzo</th>
    <th>Azione</th>
  </tr>
  <%
  ArrayList<Prodotto> prodotti = (ArrayList<Prodotto>)request.getAttribute("prodotti");
  for(Prodotto p : prodotti) {
	 
  %>
  <tr>
    <td><%= p.getNome() %></td>
    <td><%= p.getPrezzo() %>
    <td>
    	<form method="post" action="carrello">
    		<input type="hidden" name="prodotto" value="<%= p.getNome() %>">
    		<input type="submit" value="Compra">
    	</form>
    </td>
  </tr>
  <% } %>
</table>

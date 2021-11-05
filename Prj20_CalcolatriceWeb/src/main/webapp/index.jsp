<%@page import="controller.Calcolatrice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String titolo = "Mia calcolatrice"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%= titolo %></title>
</head>
<body>

	<h1><%= titolo %></h1>
	<form method="post" action="">
		<input type="number" placeholder="Inserisci operando 1" step="0.01" name="operatore1">
		<br>
		<input type="number" placeholder="Inserisci oprenado 2" step="0.01" name="operatore2">
		<br>
		+ <input type="radio" name="operazione" value="+">
		- <input type="radio" name="operazione" value="-">
		* <input type="radio" name="operazione" value="*">
		/ <input type="radio" name="operazione" value="/">
		<br>
		<input type="submit" value="Calcola">
	</form>
	
	<%
		double risultato = 0;
		if(request.getParameter("operatore1") != null && request.getParameter("operatore2") != null) {
			double operatore1 = Double.parseDouble(request.getParameter("operatore1"));
			double operatore2 = Double.parseDouble(request.getParameter("operatore2"));
			
			String operazione = request.getParameter("operazione");
						
			switch(operazione) {
			case "+":
				risultato = Calcolatrice.addizione(operatore1, operatore2);
				break;
			case "-":
				risultato = Calcolatrice.sottrazione(operatore1, operatore2);
				break;
			case "*":
				risultato = Calcolatrice.moltiplicazione(operatore1, operatore2);
				break;
			case "/":
				risultato = Calcolatrice.divisione(operatore1, operatore2);
				break;
			}
			
		}
	%>	
	<div id="result">
		<%= risultato %>
	</div>

</body>
</html>
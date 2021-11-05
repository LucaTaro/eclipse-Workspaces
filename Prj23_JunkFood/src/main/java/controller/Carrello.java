package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Prodotti;
import model.Prodotto;

/**
 * Servlet implementation class panini
 */
@WebServlet("/carrello")
public class Carrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Prodotto> prodotti;
	
	public Carrello() {
		this.prodotti = new ArrayList<Prodotto>();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.setAttribute("titolo", "Carello");
		
		request.setAttribute("prodotti", this.prodotti);
		request.getRequestDispatcher("carello.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("prodotto") != null) {
			Prodotto p = Prodotti.getProdottoByName(req.getParameter("prodotto"));
			this.prodotti.add(p);
		}
		System.out.println("asdfggh");
		doGet(req, resp);
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class panini
 */
@WebServlet("/dessert")
public class Dessert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.setAttribute("titolo", "Dessert");
		request.getRequestDispatcher("content.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}

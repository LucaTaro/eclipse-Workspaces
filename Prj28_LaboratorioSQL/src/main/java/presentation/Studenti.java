package presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StudenteDAOImpl;
import model.Studente;

/**
 * Servlet implementation class Studenti
 */
@WebServlet("/studenti")
public class Studenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudenteDAOImpl sd;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studenti() {
        super();
        this.sd = new StudenteDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Studente> studenti = this.sd.getStudente();
		request.setAttribute("studenti", studenti);
		request.getRequestDispatcher("studenti.jsp").forward(request, response);
		//response.getWriter().append(studenti.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

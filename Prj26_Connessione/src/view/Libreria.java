package view;

import dao.LibroDAO;
import model.Libro;

public class Libreria {

	public static void main(String[] args) {
		
		LibroDAO ld = new LibroDAO();
		ld.getLibri();
		
		for (Libro l : ld.getLibri()) {
			System.out.println(l);
		}

	}

}

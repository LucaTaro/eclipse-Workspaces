package collezioni.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import interfaccia.Libro;

public class ProvaMappaTabella {

	public static void main(String[] args) {

		Map<Integer, Libro> libriMappa = new HashMap<Integer, Libro>();
		//List<Libro> libriLista = new ArrayList<Libro>();
		
		libriMappa.keySet();//tutte le chiavi
		libriMappa.values();//tutti i libri
		for (Entry<Integer, Libro> libro : libriMappa.entrySet()) {
			System.out.println(libro.getKey());
			System.out.println(libro.getValue());
		}

	}

}

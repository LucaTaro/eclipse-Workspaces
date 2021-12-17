package interfaccia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClasseAnonima {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("I malavoglio", "Verga", 123, 10);
		Libro l2 = new Libro("I malavoglia", "Verga", 154, 15);
		Libro l3 = new Libro("Guerra e pace", "Tolstoj", 194, 5);
		
		List<Libro> libri = Arrays.asList(l1, l2, l3);
		
		Collections.sort(libri);
		
		for (Libro libro : libri) {
			System.out.println(libro);			
		}
		
		//Comparatore comp = new Comparatore();
		//Collections.sort(libri, new Comparatore());
		
		/*Collections.sort(libri, new Comparator<Libro>() {
			@Override
			public int compare(Libro libro1, Libro libro2) {
				return libro1.getPagine() - libro2.getPagine();
			}
		});*/
		
		Collections.sort(libri, (l4, l5) ->	l4.getPagine() - l5.getPagine());
	
		libri.forEach(l ->System.out.println(l));
	}

}

package collezioni.set;

import java.util.HashSet;
import java.util.TreeSet;

class Libro implements Comparable<Libro>{
	String titolo;
	double prezzo;
	
	public Libro(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(altro.titolo);
	}
	
}

public class ProvaSetLibro {

	public static void main(String[] args) {
		Libro l2 = new Libro("Ahsoka", 15.99);
		Libro l = new Libro("Guida galattica per autostoppisti", 19.99);
		
		HashSet<Libro> libri = new HashSet<Libro>();
		libri.add(l);
		libri.add(l2);
		libri.add(l);
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
		System.out.println();
	
		TreeSet<Libro> libri2 = new TreeSet<Libro>();
		libri2.add(l);
		libri2.add(l2);
		libri2.add(l);
	
		for (Libro libro : libri2) {
			System.out.println(libro);
		}
	}
}
package interfaccia;

public class Libro implements Comparable<Libro> {
	
	private String titolo, autore;
	private int pagine, prezzo;
	
	public Libro(String titolo) {
		this.titolo = titolo;
		this.autore = titolo.substring(0, 4).toUpperCase();
		this.pagine = titolo.length();
		this.prezzo = titolo.length();
		
	}
	
	public Libro(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public int compareTo(Libro altroLibro) {
		return this.titolo.compareTo(altroLibro.titolo);
	}
}

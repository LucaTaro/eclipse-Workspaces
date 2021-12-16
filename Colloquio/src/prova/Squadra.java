package prova;

public class Squadra {
	
	private String nome;
	private int punteggio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	public Squadra(String nome, int punteggio) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
	}
	

}

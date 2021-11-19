package model;

public class Babbo extends User {

	private int id;
	private String mezzo;
	private String zona;
	private String nomeDaBabbo;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMezzo() {
		return mezzo;
	}
	public void setMezzo(String mezzo) {
		this.mezzo = mezzo;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getNomeDaBabbo() {
		return nomeDaBabbo;
	}
	public void setNomeDaBabbo(String nomeDaBabbo) {
		this.nomeDaBabbo = nomeDaBabbo;
	}
	@Override
	public String toString() {
		return "Babbo [id=" + id + ", mezzo=" + mezzo + ", zona=" + zona + ", nomeDaBabbo=" + nomeDaBabbo
				+ ", getNome()=" + getNome() + ", getCognome()=" + getCognome() + "]";
	}
	
	
	
}

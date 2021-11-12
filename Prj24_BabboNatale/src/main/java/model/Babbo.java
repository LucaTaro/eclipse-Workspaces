package model;

public class Babbo extends User {

	protected String mezzo;
	protected String zona;
	protected String nomeDaBabbo;
	
	public Babbo(String mezzo, String zona, String nomeDaBabbo) {
		super();
		this.mezzo = mezzo;
		this.zona = zona;
		this.nomeDaBabbo = nomeDaBabbo;
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
	
	
	
	

}

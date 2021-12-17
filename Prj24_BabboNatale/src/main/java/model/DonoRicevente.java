package model;

public class DonoRicevente {
	
	public DonoRicevente(int idDono, int idRicevente) {
		int[][] donoRicevente = new int[0][1];
		donoRicevente[0][0] = idDono;
		donoRicevente[0][1] = idRicevente;
	}
	
	/*private ArrayList<Dono> doni = new ArrayList<Dono>();
	private ArrayList<Ricevente> riceventi = new ArrayList<Ricevente>();
	
	private RiceventeDAOImpl rdao = new RiceventeDAOImpl();
	private DonoDAOImpl donodao = new DonoDAOImpl();
	
	public ArrayList<Dono> popolaDoni() {
		for(Dono d : donodao.getDoni()) {
			doni.add(d);
		}
		return doni;
	}
	
	public ArrayList<Dono> popolaRiceventi() {
		for(Ricevente r : rdao.getRiceventi()) {
			riceventi.add(r);
		}
		return doni;
	}*/
	
	/*public String accoppiaDR(int idDono, int idRicevente) {
		String donoRicevente = idDono + ", " + idRicevente;
		return donoRicevente;
	}*/
		
}

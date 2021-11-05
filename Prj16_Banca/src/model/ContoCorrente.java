package model;

import java.util.ArrayList;

public class ContoCorrente {
	
	private static int numeratoreConti = 1;
	private ArrayList<Cliente> titolari;
	private int numeroConto;
	private double saldo;
	private ArrayList<Movimento> movimenti;
	
	public ContoCorrente(ArrayList<Cliente> titolari) {
		this.numeroConto = numeratoreConti++;
		this.saldo = 0;
		this.movimenti = new ArrayList<Movimento>();
		this.titolari = titolari;
	}
	
	public ContoCorrente(Cliente c) {
		this.numeroConto = numeratoreConti++;
		this.saldo = 0;
		this.movimenti = new ArrayList<Movimento>();
		this.titolari = new ArrayList<Cliente>();
		this.titolari.add(c);
	}
	
	public void addNuovoTitolare(Cliente c) {
		this.titolari.add(c);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addMovimento(Movimento m) {
		this.movimenti.add(m);
		this.saldo += m.getAmount();
	}
	
	public void versamento(double soldi, String desc) {
		if (soldi > 0) {
			if (desc == null) 
				desc = "Versamento";
			Movimento m = new Movimento(soldi, desc);
			this.movimenti.add(m);
			this.saldo += soldi;
		}
	}
	
	public void prelievo(double soldi, String desc) {
		if (soldi > 0 && soldi <= this.saldo) {
			if (desc == null)
				desc = "Prelievo";
			Movimento m = new Movimento(soldi, desc);
			this.movimenti.add(m);
			this.saldo -= soldi;
		}
	}

	public int getNumeroConto() {
		return numeroConto;
	}
	
	public String elencoTitolari() {
		StringBuilder sb = new StringBuilder("Titolari del cc");
		sb.append("\n " + numeroConto);
		for (Cliente c : titolari) {
			sb.append("\n " + c);
			}
		return sb.toString();
	}

}

package model;

public class ContoCorrente {
	
	private static int numeratoreConti = 1;//variabile globale e non ? una propriet? dell'oggeto quindi non fa parte degli oggetti ma fa parte della classe
	private double saldo; //poich? non deve essere accessibile da tutti
	private int numeroConto;
	private Cliente titolare;
	
	public ContoCorrente(Cliente nome) {
		saldo = 0.0;
		numeroConto = numeratoreConti++;
		titolare = nome;
	}
	
	public Cliente getCliente() {
		return titolare;
	}
	
	public void versamento (double euro) {
		saldo += euro;
		
	}
	
	public void prelievo (double euro) {
		if (saldo > euro) 
			saldo -= euro;
		
	}
	
	public double dammiSaldo () {
		return saldo;
	}
	
	public int dammiNumero() {
		return numeroConto;
	}
}

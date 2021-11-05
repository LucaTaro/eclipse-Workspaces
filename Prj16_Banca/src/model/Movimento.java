package model;

import java.time.LocalDateTime;

public class Movimento {
	
	private LocalDateTime marcaTemporale;
	private double amount;
	private String description;
	
	public Movimento(double amount, String description) {
		this.marcaTemporale = LocalDateTime.now();
		this.amount = amount;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Alle ore  " + marcaTemporale + "  " + description + " per l'ammontare di " + amount;
	}

	public double getAmount() {
		return amount;
	}	
	
}

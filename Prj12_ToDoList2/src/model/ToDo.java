package model;

public class ToDo {
	//incapsulamento
	private String description;
	private boolean done;
	
	/**
	 * Costruttore di oggetti di tipo ToDo
	 * @param desc Qui inserire la descrizione di Questa nota
	 */
	public ToDo(String desc) {//costruttore che verrà richiamato per costruire l'oggeto
		done = false;
		description = desc;
		System.out.println("Oggetto ToDo costruito");
	}
	//overload del metodo costruttore: deve avere firma differente
	public ToDo(String description, boolean done) {
		this.description = description;
		this.done = done;
	}
	//metodi accessori e mutatori	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "[description=" + description + ", done=" + done + "]";
	}
	
}

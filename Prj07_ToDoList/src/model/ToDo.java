package model;

public class ToDo {

	String description;
	boolean done;
	
	/**
	 * Costruttore di oggetti di tipo ToDo
	 * @param desc Qui inserire la descrizione di Questa nota
	 */
	public ToDo(String desc) {//costruttore che verr? richiamato per costruire l'oggeto
		done = false;
		description = desc;
		System.out.println("Oggetto ToDo costruito");
	}
	
	public String toString() {
		return "************"
				+ "\n Nota \n"
				+ description
				+ "\n "
				+ "************";
		
	}
}

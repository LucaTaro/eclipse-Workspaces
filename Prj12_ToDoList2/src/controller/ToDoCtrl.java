package controller;

import java.util.ArrayList;

import model.ToDo;

public class ToDoCtrl {
	
	private ArrayList<ToDo> coseDaFare;

	public ToDoCtrl() {
		this.coseDaFare = new ArrayList<>();
	}

	public void addTodo(String cosadafare) {
		//creo un nuovo oggetto di tipo ToDo con la descrizione
		ToDo nuovo = new ToDo(cosadafare);
		//aggiungo all'arraylist il todo appena creato
		this.coseDaFare.add(nuovo); 
	}

	public ArrayList<ToDo> getCoseDaFare() {
		return coseDaFare;
	}
	
	public void haiCompletato(int id) {
		if (id < 0 || id > this.coseDaFare.size()-1) {
			System.out.println("Un ce stà");
		} else {
			this.coseDaFare.get(id).setDone(true);
		}
	}
	
}

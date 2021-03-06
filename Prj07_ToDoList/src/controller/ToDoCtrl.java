package controller;

import model.ToDo;

public class ToDoCtrl {
	
	ToDo[] todos;
	
	public ToDoCtrl() {
		todos = new ToDo[10];
		System.out.println("Controller costruito");
		}
	
	public void addToDo(String messaggio) {//non ? un costruttore
		int pos = trovaPostoLibero();
		if (pos > -1) 
			todos[pos] = new ToDo(messaggio);
		else
			System.out.println("Note piene");
	}
	
	private int trovaPostoLibero() {
		//int pos = -1;
		for (int i = 0; i < todos.length; i++) {
			if(todos[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public String[] showAllTodo() {
		String[] allTodos = new String[todos.length];
		for (int i = 0; i < allTodos.length; i++) {
			allTodos[i] = todos[i].toString();
		}
		return allTodos;
	}

	public String showToDo(int pos) {
		return todos[pos].toString();
	}
}

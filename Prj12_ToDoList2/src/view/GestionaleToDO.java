package view;

import controller.ToDoCtrl;
import model.ToDo;

public class GestionaleToDO {

	public static void main(String[] args) {

		ToDoCtrl ctrl = new ToDoCtrl();
		ctrl.addTodo("Imparare java");//metodo
		ctrl.addTodo("Imparare java1");//metodo
		ctrl.addTodo("Imparare java2");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		ctrl.addTodo("Imparare java3");//metodo
		
		ctrl.haiCompletato(4);
		
		for (ToDo nota : ctrl.getCoseDaFare()) {
			System.out.println(nota);
			System.out.println();
		}
		
	}

}

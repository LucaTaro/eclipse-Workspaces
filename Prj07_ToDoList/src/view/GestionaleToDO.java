package view;

import controller.ToDoCtrl;

public class GestionaleToDO {

	public static void main(String[] args) {

		ToDoCtrl ctrl = new ToDoCtrl();
		ctrl.addToDo("Imparare java");//metodo
		ctrl.addToDo("Imparare java1");//metodo
		ctrl.addToDo("Imparare java2");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		ctrl.addToDo("Imparare java3");//metodo
		
		for (String string : ctrl.showAllTodo()) {
			System.out.println(string);
			System.out.println();
		}
		
	}

}

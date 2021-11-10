package database;

import java.util.ArrayList;

import model.Studente;

public interface StudenteDAO {
	
	//Attributi implicitamente public e final
	String TROVA_TUTTI = "select id, nome, cognome from studente";
	String TROVA_UNO = "select id, nome, cognome from studente where id = ";
	//In un'interfaccia i metodi sono implicitamente public e abstract
	void addStudente(Studente s);
	
	ArrayList<Studente> getStudente();
	Studente getStudenteById(int id);
	
	void updateStudente(Studente s);
	
	void deleteStudente(Studente s);
	void deleteStudente(int id);

}

package dao;

import java.util.ArrayList;

import model.Ricevente;

public interface RiceventeDAO {
	
	String FIND_ALL = "select * from ricevente";
	
	ArrayList<Ricevente> getRiceventi();

}

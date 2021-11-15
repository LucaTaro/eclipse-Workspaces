package dao;

import java.util.ArrayList;

import model.Dono;

public interface DonoDAO {
	
	String FIND_ALL = "select * from dono";
	
	ArrayList<Dono> getDoni();

}

package dao;

import java.util.ArrayList;

import model.Babbo;

public interface BabboDAO {
	
	String FIND_ALL = "select * from babbo";
	
	ArrayList<Babbo> getBabbi();

}

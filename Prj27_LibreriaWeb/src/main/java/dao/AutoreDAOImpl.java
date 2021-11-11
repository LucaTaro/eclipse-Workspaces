package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Db;
import model.Autore;

public class AutoreDAOImpl implements AutoreDAO {
	
	Db db = new Db();
	Connection conn;
	Statement stat;
	ResultSet rs;
	

	@Override
	public void addAutore(Autore autore) {
		String query = "insert into autore(nome, cognome, nazionalita) "
				+ "values('" + autore.getNome() +  "', '" +  autore.getCognome()+ "', '" + autore.getNazionalita()  + "')";
		this.conn = this.db.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.stat.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateAutore(Autore autore) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAutore(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Autore getAutoreById(int id) {
		Autore temp = null;
		this.conn = this.db.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery(FIND_ONE + id);
			while(rs.next()) {
				temp = new Autore();
				temp.setId(rs.getInt("id"));
				temp.setNome(rs.getString("nome"));
				temp.setCognome(rs.getString("cognome"));
				temp.setNazionalita(rs.getString("nazionalita"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}

	@Override
	public ArrayList<Autore> getAutori() {
		ArrayList<Autore> autori = new ArrayList<Autore>();
		this.conn = this.db.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery(TROVA_TUTTI);
			while(rs.next()) {
				Autore temp = new Autore();
				temp.setId(rs.getInt("id"));
				temp.setNome(rs.getString("nome"));
				temp.setCognome(rs.getString("cognome"));
				temp.setNazionalita(rs.getString("nazionalita"));
				autori.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return autori;
	}

}

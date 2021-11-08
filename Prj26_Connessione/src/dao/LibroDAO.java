package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Db;
import model.Libro;

public class LibroDAO {
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	private Db database = new Db();
	
	public ArrayList<Libro> getLibri() {
		ArrayList<Libro> libri = new ArrayList<Libro>();
		
		this.conn = database.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery("select id, titolo, prezzo from libro;");
			while (rs.next()) {
				int id = rs.getInt("id");
				String titolo = rs.getString("titolo");
				double prezzo = rs.getDouble("prezzo");
				Libro l = new Libro(id, titolo, prezzo);
				libri.add(l);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return libri;
	}
	
}

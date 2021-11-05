package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class Studenti {

	public static void main(String[] args) {
		
		DB db = new DB();
		
		Connection c = db.connetti();
		Statement stat = null;
		ResultSet rs = null;
		try {
			stat = c.createStatement();
			rs = stat.executeQuery("select nome, cognome from Studente");
			while (rs.next()) {
				System.out.println("Studente aggiunto " + rs.getString("nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

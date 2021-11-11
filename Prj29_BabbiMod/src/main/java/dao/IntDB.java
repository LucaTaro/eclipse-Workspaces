package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.Db;

public class IntDB {
	static Db db = new Db();
	static Connection connessione;
	static Statement stat;
	
	public static void creaTabellaBabbi() {
		
		String query = "create table if not exists babbi ("
				+ "id int auto_increment,"
				+ "nome varchar(10),"
				+ "password varchar(10),"
				+ "primary key(id) )";
		
		connessione = db.connetti();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

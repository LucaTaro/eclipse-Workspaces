package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class IntDB {
	static DB db = new DB();
	static Connection connessione;
	static Statement stat;
	
	public static void creaTabellaBabbi() {
		
		String query = "create table if not exists babbo ("
				+ "id int auto_increment,"
				+ "nome varchar(20),"
				+ "password varchar(10),"
				+ "password varchar(10),"
				+ "password varchar(10),"
				+ "primary key(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaTabellaDoni() {
		
		String query = "create table if not exists doni ("
				+ "id int auto_increment,"
				+ "descrizione varchar(20),"
				+ "primary key(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaTabellaConsegne() {
		
		String query = "create table if not exists consegne ("
				+ "id int auto_increment,"
				+ "id_babbo int,"
				+ "id_dono int,"
				+ "bambino varchar(20),"
				+ "primary key(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}

}

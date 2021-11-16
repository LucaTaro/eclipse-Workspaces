package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class InitDB {
	static DB db = new DB();
	static Connection connessione;
	static Statement stat;
	
	public static void creaTabellaBabbi() {
		
		String query = "create table if not exists babbo ("
				+ "id int auto_increment,"
				+ "nome varchar(20),"
				+ "cognome varchar(30),"
				+ "mezzo varchar(15),"
				+ "zona varchar(10),"
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
		
		String query = "create table if not exists dono ("
				+ "    id int auto_increment primary key,"
				+ "    nome varchar(20) ,"
				+ "    disponibilita tinyint unsigned )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaTabellaRiceventi() {
		
		String query = "create table if not exists ricevente("
				+ "    id int auto_increment primary key,"
				+ "    nome varchar(20),"
				+ "    indirizzo varchar(40),"
				+ "    zona varchar(10) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
public static void creaTabellaCredenziali() {
		
		String query = "create table if not exists credenziali("
				+ "    username varchar(30) primary key,"
				+ "    password varchar(20),"
				+ "    super enum('S', 'N')";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void riempiTabella (String query) {
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//creaTabellaBabbi();
		//creaTabellaDoni();
		//creaTabellaRiceventi();
		//creaTabellaCredenziali();
	}

}

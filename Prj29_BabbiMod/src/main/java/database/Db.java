package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	private final String DB_NAME = "generation";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;
	private final String USER = "app_generation";
	private final String PASSWORD = "generation_2021";
	
	private Connection conn;
	
	public Connection connetti() {
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.conn = DriverManager.getConnection(HOST, USER, PASSWORD);
			System.out.println("Connessione avvenuta");
		} catch (SQLException e) {
			System.err.println("Errore nella connessione");
			System.err.println(e.getMessage());
		}
		return conn;
	}
	
	public Connection disc() {
		try {
			if(this.conn != null) {
				this.conn.close();
				System.out.println("Disconnessione avvenuta");
			}
		} catch (SQLException e) {
			System.err.println("Errore nella disconnessione");
			System.err.println(e.getMessage());
		}
		return conn;
	}
}

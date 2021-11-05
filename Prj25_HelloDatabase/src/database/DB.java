package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	private String host = "jdbc:mysql://localhost:3306/generation";
	private String user = "app_generation";
	private String password = "generation_2021";
	private Connection connessione = null;

	public Connection connetti() {
		try {
			this.connessione = DriverManager.getConnection(host, user, password);
			System.out.println("Siamo connessi");
		} catch (SQLException e) {
			System.err.println("Connection error");
		}
		return this.connessione;
	}
}

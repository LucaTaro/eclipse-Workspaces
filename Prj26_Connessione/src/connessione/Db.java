package connessione;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	
	private final String HOST = "jdbc:mysql://localhost:3306/generation";
	private final String USER = "app_generation";
	private final String PASSWORD = "generation_2021";
	private Connection conn = null;
	
	public Connection connetti() {
		try {
			if(this.conn==null) {
				this.conn = DriverManager.getConnection(HOST, USER, PASSWORD);
			}
		} catch (Exception e) {
			System.err.println("Connessione non avvenuta " + e.getMessage());
		}
		return conn;
	}
	
	public void disconnetti() {
		if(this.conn!=null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				System.err.println("Disconnessione non avvenuta" + e.getMessage());
			}
		}
	}

}

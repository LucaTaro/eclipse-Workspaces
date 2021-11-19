package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Ricevente;

public class RiceventeDAOImpl implements RiceventeDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	DB db = new DB();

	@Override
	public ArrayList<Ricevente> getRiceventi() {
		ArrayList<Ricevente> riceventi = new ArrayList<Ricevente>();
		this.conn = db.getConnection();
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			while(rs.next()) {
				Ricevente r = new Ricevente();
				r.setId(this.rs.getInt("id"));
				r.setIndirizzo(this.rs.getString("indirizzo"));
				r.setZona(this.rs.getString("zona"));
				r.setNome(this.rs.getString("nome"));
				riceventi.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return riceventi;
	}

}

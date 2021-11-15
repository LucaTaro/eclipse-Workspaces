package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Dono;

public class DonoDAOImpl implements DonoDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	DB db = new DB();

	@Override
	public ArrayList<Dono> getDoni() {
		ArrayList<Dono> doni = new ArrayList<Dono>();
		this.conn = db.getConnection();
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			while(rs.next()) {
				Dono d = new Dono();
				d.setId(this.rs.getInt("id"));
				d.setDescrizione(this.rs.getString("nome"));
				d.setDisponibilita(this.rs.getInt("disponibilita"));
				doni.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return doni;
	}
}

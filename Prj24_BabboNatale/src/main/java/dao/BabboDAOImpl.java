package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Babbo;

public class BabboDAOImpl implements BabboDAO {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	DB db = new DB();

	@Override
	public ArrayList<Babbo> getBabbi() {
		
		ArrayList<Babbo> babbi = new ArrayList<>();
		
		this.conn = db.getConnection();
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			while(rs.next()) {
				Babbo b = new Babbo();
				b.setId(this.rs.getInt("id"));
				b.setNomeDaBabbo("babbo " + b.getId());
				b.setNome(rs.getString("nome"));
				b.setCognome(rs.getString("cognome"));
				b.setMezzo(rs.getString("mezzo"));
				b.setZona(rs.getString("zona"));
				babbi.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return babbi;
	}

}

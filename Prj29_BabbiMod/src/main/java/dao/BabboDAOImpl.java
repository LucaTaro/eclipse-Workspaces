package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.Db;
import model.Babbo;

public class BabboDAOImpl implements BabboDAO {
	
	Db db = new Db();
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public void addBabbo(Babbo babbo) throws SQLException {
		
		this.connection = this.db.connetti();
		this.ps = this.connection.prepareStatement(INSERT);
		this.ps.setString(1, babbo.getUsername());
		this.ps.setString(2, babbo.getPassword());
		this.ps.execute();
	}

	@Override
	public void updateBabbo(Babbo babbo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBabbo(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Babbo getBabbo(int id) throws SQLException {
		
		this.connection = this.db.connetti();
		this.ps = this.connection.prepareStatement(FIND_ONE);
		this.ps.setInt(1, id);
		this.rs = this.ps.executeQuery();
		this.rs.next();
		
		Babbo babbo = new Babbo();
		babbo.setId(this.rs.getInt("id"));
		babbo.setUsername(this.rs.getString("nome"));
		babbo.setPassword(this.rs.getString("password"));

		return babbo;
	}

	@Override
	public ArrayList<Babbo> getBabbi() throws SQLException {
		
		ArrayList<Babbo> babbi = new ArrayList<Babbo>();
		
		this.connection = this.db.connetti();
		this.ps = this.connection.prepareStatement(FIND_ALL);
		this.rs = this.ps.executeQuery();
		while (rs.next()) {
			Babbo babbo = new Babbo();
			babbo.setId(this.rs.getInt("id"));
			babbo.setUsername(this.rs.getString("nome"));
			babbo.setPassword(this.rs.getString("password"));
			
			babbi.add(babbo);
		}
		
		return babbi;
	}

}
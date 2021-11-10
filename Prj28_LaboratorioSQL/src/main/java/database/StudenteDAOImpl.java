package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Studente;

public class StudenteDAOImpl implements StudenteDAO{

	private Db db = new Db();
	private Statement stat;
	private ResultSet rs;
	private Connection conn;
	
	@Override
	public void addStudente(Studente s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Studente> getStudente() {
		this.conn = db.connetti();
		ArrayList<Studente> elenco = new ArrayList<>();
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery(TROVA_TUTTI);
			while(rs.next()) {
				Studente temp = new Studente();
				temp.setId(rs.getInt(1));
				temp.setNome(rs.getString(2));
				temp.setCognome(rs.getString(2));
				elenco.add(temp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return elenco;
	}

	@Override
	public Studente getStudenteById(int id) {
		this.conn = db.connetti();
		Studente temp = null;
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery(TROVA_UNO + id);
			while(rs.next()) {
				temp = new Studente();
				temp.setId(rs.getInt(1));
				temp.setNome(rs.getString(2));
				temp.setCognome(rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public void updateStudente(Studente s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudente(Studente s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudente(int id) {
		// TODO Auto-generated method stub
		
	}

}

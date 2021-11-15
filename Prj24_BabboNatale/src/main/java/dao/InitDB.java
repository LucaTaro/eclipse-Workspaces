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
		creaTabellaRiceventi();
		riempiTabella("insert into dono(nome, disponibilita) "
				+ "values "
				+ "('trenino','2'),"
				+ "('bambola','5'),"
				+ "('soldatino','4'),"
				+ "('macchinina','6'),"
				+ "('chitarra','1'),"
				+ "('maglione','3'),"
				+ "('pallone','4'),"
				+ "('gioco di società','3'),"
				+ "('libro','2'),"
				+ "('aeroplanino','2'),"
				+ "('pastelli colorati', '4'),"
				+ "('Peluche', '4');"
				+ "insert into ricevente(nome, indirizzo, zona) "
				+ "values "
				+ "('Gabriele','via Padova 12', 'nord'), "
				+ "('Anita','via della battaglia 18', 'nord'), "
				+ "('Paolo','via Padova 57', 'nord'), "
				+ "('Mauro','via Modena 56', 'nord'), "
				+ "('Franca','vicolo corto 1', 'nord'), "
				+ "('Marcello','via della sorte 13', 'nord'), "
				+ "('Eugenia','via della Pace 22', 'nord'), "
				+ "('Daniela','corso Stati Uniti 3', 'nord'), "
				+ "('Niccolò','piazza dell orologio 4', 'nord'), "
				+ "('Annabel','piazza dell orologio 16', 'nord'), "
				+ "('Francesca','via Enrico Fermi 39', 'sud'), "
				+ "('Tommaso','via della Chiesa 123', 'sud'), "
				+ "('Donatella','via Milano 55', 'sud'), "
				+ "('Beatrice','via Milano 67', 'sud'), "
				+ "('Sara','corso francia 84 ', 'sud'), "
				+ "('Virgilo','via teodorico 15', 'sud'), "
				+ "('Giovanni','piazza della stazione 7', 'sud'), "
				+ "('Alessio','piazza della stazione 18', 'sud'), "
				+ "('Fernanda','borgo san martino 67', 'sud'), "
				+ "('Luca','borgo san martino 112', 'sud'), "
				+ "('Matteo','via Roma 58', 'centro'), "
				+ "('Gaetano','vai dell amore 64', 'centro'), "
				+ "('Vanessa','via Cavour 45', 'centro'), "
				+ "('Ovidio','via Cavour 78', 'centro'), "
				+ "('Luigi','via archimede 38', 'centro'), "
				+ "('Rebecca','via Roma 13', 'centro'), "
				+ "('Carlo','via dell amore 69', 'centro'), "
				+ "('Sonia','via Kennedy 17', 'centro'), "
				+ "('Antonella','via della torre 63', 'centro'), "
				+ "('Riccardo','via varazze 32', 'centro'), "
				+ "('Kevin','corso calabria 14', 'periferia'), "
				+ "('Cesare','corso calabria 16', 'periferia'), "
				+ "('Alessandro','viale dita dal naso 65', 'periferia'), "
				+ "('Elisa','via sacchi 23', 'periferia'), "
				+ "('Diego','via francescana 58', 'periferia'), "
				+ "('Stefano','vicolo stretto 21', 'periferia'), "
				+ "('Elisabetta','via solfatara 33', 'periferia'), "
				+ "('MariaSole','piazzetta Enzo Ferrari 5', 'periferia'), "
				+ "('Armando','viale monte rosa 18', 'periferia'), "
				+ "('Veronica','viale monte rosa 89', 'periferia');"
				+ "insert into babbo(nome, cognome, mezzo, zona) "
				+ "values "
				+ "('Luca', 'Rossi', 'automobile', 'nord'), "
				+ "('André', 'Del Pero', 'bicicletta', 'nord'), "
				+ "('Alessandro', 'Verdi', 'motocicletta', 'sud'), "
				+ "('Francesca', 'Ferrari', 'automobile', 'sud'), "
				+ "('Carlo', 'Costa', 'bicletta', 'centro'), "
				+ "('Donatella', 'Fontana', 'bicletta', 'centro'), "
				+ "('Clara', 'Russo', 'motocicletta', 'periferia'), "
				+ "('Filippo', 'Gallo', 'automobile', 'periferia');");
	}

}

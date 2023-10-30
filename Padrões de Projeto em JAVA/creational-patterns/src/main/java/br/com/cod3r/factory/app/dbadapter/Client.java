package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB postgre = new PostgresFactory().getDatabase();
		DB oracle = new OracleFactory().getDatabase();
		postgre.query("INSERT INTO users VALUES ('User', 25)");
		oracle.query("INSERT INTO users VALUES ('User', 25)");
		postgre.update("INSERT INTO users VALUES ('User', 25)");
		oracle.update("select * from cliente;");
	}
}

package br.net.erponline.services;

public class ConexaoMySQL extends Conexao {
	
	public ConexaoMySQL() {
		super();
	}
	
	public ConexaoMySQL(String server, String port, String database, String username, String password) {
		super();
		
		if (server != null) {
			this.server = server;
		}

		if (port != null) {
			this.port = port;
		}
		
        this.database = database;
        this.username = username;
        this.password = password;
	}

	@Override
	public void setDefaultValue() {
		this.conected = false;
		this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://";
        this.server = "localhost";
		this.port = "3306";
	}
}
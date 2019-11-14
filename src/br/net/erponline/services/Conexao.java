package br.net.erponline.services;

public abstract class Conexao {
    protected String server;
    protected String port;
    protected String database;
    protected String driver;
    protected String url;
    protected String username;
    protected String password;
    protected Boolean conected;
	
    public Conexao() {
    	setDefaultValue();
    }

	public Conexao(String server, String port, String database, String driver, String url, String username,
			String password) {
		super();
		this.server = server;
		this.port = port;
		this.database = database;
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean isConected() {
		return conected;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		result.append("{");
		result.append("\"result\" : [{");
		result.append("\"driver\" : \""+this.driver+"\", ");
		result.append("\"server\" : \""+this.server+"\", ");
		result.append("\"port\" : \""+this.port+"\", ");
		result.append("\"database\" : \""+this.database+"\", ");
		result.append("\"url\" : \""+this.url+"\", ");
		result.append("\"username\" : \""+this.username+"\", ");
		result.append("\"password\" : \""+this.password+"\", ");
		result.append("\"conected\" : \""+Boolean.toString(this.conected)+"\", ");
		result.append("}]");
		result.append("}");
		
		return result.toString();
	}
	
	public abstract void setDefaultValue();
}
package br.net.erponline.view;

import br.net.erponline.services.Conexao;
import br.net.erponline.services.ConexaoMySQL;
import br.net.erponline.services.ConexaoPostgreSQL;

public class MainConexao {

	public static void main(String[] args) {
		Conexao conexaoMySQL1 = new ConexaoMySQL();
		Conexao conexaoMySQL2 = new ConexaoMySQL("server", "port", "database", "username", "password");
		
		Conexao conexaoPostgreSQL1 = new ConexaoPostgreSQL();
		Conexao conexaoPostgreSQL2 = new ConexaoPostgreSQL("server", "port", "database", "username", "password");
				
		System.out.println(conexaoMySQL1.toString());
		System.out.println(conexaoMySQL2.toString());
		System.out.println("-----------------------------");
		System.out.println(conexaoPostgreSQL1.toString());
		System.out.println(conexaoPostgreSQL2.toString());
	}
}
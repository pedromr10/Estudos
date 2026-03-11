package application;

import java.sql.Connection;
import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}

/*
 
 statement - usado para montar um comando sql pra ser executado
 resultset - retorna um objeto com o resultado da consulta, na forma de tabela
 
 */
 
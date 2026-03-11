package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();

			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM department");
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//rs.close();  esses metodos precisam de try catch, foi feito um qasa
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}

/*
 * 
 * statement - usado para montar um comando sql pra ser executado resultset -
 * retorna um objeto com o resultado da consulta, na forma de tabela
 * 
 */

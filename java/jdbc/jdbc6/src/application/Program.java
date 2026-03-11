package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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

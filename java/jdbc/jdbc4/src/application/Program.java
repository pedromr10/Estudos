package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn
					.prepareStatement("UPDATE seller " + "SET BaseSalary = BaseSalary + ? " + "WHERE DepartmentId = ?");
			st.setDouble(1, 200.00); // lembrando que nao comeca do zero
			st.setInt(2, 2);

			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows affected: " + rowsAffected);
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

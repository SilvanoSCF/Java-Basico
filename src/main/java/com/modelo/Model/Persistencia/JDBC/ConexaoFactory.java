package com.modelo.Model.Persistencia.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	public static Connection getConnection(){	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db01","root", "root");
			
		} catch (SQLException e) {
			//Relançando a exception
			throw new RuntimeException(e);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	
}

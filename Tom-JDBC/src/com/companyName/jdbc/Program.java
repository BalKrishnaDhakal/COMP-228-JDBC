package com.companyName.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	// SQL STATEMENTS===============
	private static String QueryString= "Select * from Student";



	public static void main(String[] args) throws SQLException {
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		
		
	try {
		Connection connection = DBConfi.getConnection();
		System.out.println("Database Connected---");
		
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		resultSet = statement.executeQuery(QueryString);
		System.out.printf("%10s%10s%10s%n", "SIN", "NAME","GRADE" );
		System.out.println("======================================");
		while(resultSet.next()) {
		System.out.print(resultSet.getInt("SIN") +"- ");
		System.out.print(resultSet.getString("FirstName")+ " " );
		System.out.print(resultSet.getString("MI")+ " ");
		System.out.print(resultSet.getString("LastName") + " -  ");
		System.out.println(resultSet.getString("grade") );
		
		}
		
	} catch (SQLException exception) {
		DBConfi.displayException(exception);
	}
	finally {
		if(resultSet!=null) {
			resultSet.close();
		}
		if(statement!=null) {
			statement.close();
		}
		
	}
		
		
	}

}

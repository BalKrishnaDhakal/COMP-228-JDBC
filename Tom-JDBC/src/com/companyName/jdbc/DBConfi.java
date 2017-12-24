package com.companyName.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfi {
// PRIVATE CONSTANTS =======
private static final String USERNAME = "COMP228_F18_126";
private static final String PASSWORD = "password";
private static final String CONN_STRING = "jdbc:oracle:thin:@oracle1.centennialcollege.ca:1521:SQLD";
// UTILITY METHODS THAT CONNECTS TO SQL SERVER===================
public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
}
// UTILITY METHOD THAT DISPLAYS OUR ERRORS IN MORE DETAILS===========
public static void displayException(SQLException exception) {
	System.err.println("Error Message: " + exception.getMessage());
	System.err.println("Error COde: " + exception.getErrorCode());
	System.err.println("SQL State: " + exception.getSQLState());
}


}

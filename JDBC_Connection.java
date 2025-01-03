package com.jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This class establishes a connection to the database
public class JDBC_Connection {
	// Method to create and return a database connection
	public static Connection get_connection() {
		String url = "jdbc:mysql://localhost/myDb"; // Database URL
		String username = "root"; // Database username
		String password = "vinita252311"; // Database password
		Connection con = null;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the connection
			con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				System.out.println("Connected successfully");
			}
		} catch (ClassNotFoundException e) {
			// Handle error if JDBC driver is not found
			System.out.println("MySQL Driver not found. Add external jar file.");
			e.printStackTrace();
		} catch (SQLException e) {
			// Handle error if connection fails
			System.out.println("Connection failed");
			e.printStackTrace();
		}

		return con; // Return the connection object
	}
}

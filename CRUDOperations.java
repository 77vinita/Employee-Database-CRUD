package com.jdbc_api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//This class contains CRUD (Create, Read, Update, Delete) operations
public class CRUDOperations {
	PreparedStatement st = null; // To execute SQL queries
	ResultSet rs = null; // To store query results
	int result; // To store the number of affected rows
	Connection con = JDBC_Connection.get_connection(); // Get database connection

	// Method to insert a new employee into the database
	public int insertData(Employee emp) throws SQLException {
		st = con.prepareStatement("INSERT INTO EMPLOYEE (name, department, address, salary) VALUES (?, ?, ?, ?)");
		st.setString(1, emp.getName()); // Set name
		st.setString(2, emp.getDepartment()); // Set department
		st.setString(3, emp.getAddress()); // Set address
		st.setDouble(4, emp.getSalary()); // Set salary

		result = st.executeUpdate(); // Execute the query
		return result;
	}

	// Method to view all employees in the database
	public void viewAllData() throws SQLException {
		st = con.prepareStatement("SELECT * FROM EMPLOYEE"); // SQL query to fetch all employees
		rs = st.executeQuery(); // Execute the query

		System.out.println("Employee Details:");
		while (rs.next()) {
			// Print details of each employee
			System.out.println("Eid: " + rs.getInt("eid"));
			System.out.println("Name: " + rs.getString("name"));
			System.out.println("Department: " + rs.getString("department"));
			System.out.println("Address: " + rs.getString("address"));
			System.out.println("Salary: " + rs.getDouble("salary"));
			System.out.println("========================================");
		}
	}

	// Method to view details of a specific employee by ID
	public void viewDataById(int id) throws SQLException {
		st = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE eid = ? ");
		st.setInt(1, id);
		rs = st.executeQuery();

		System.out.println("Details of Employee with id: " + id);
		while (rs.next()) {
			// Print details of the employee
			System.out.println("Eid: " + rs.getInt("eid"));
			System.out.println("Name: " + rs.getString("name"));
			System.out.println("Department: " + rs.getString("address"));
			System.out.println("Address: " + rs.getString("address"));
			System.out.println("Salary: " + rs.getDouble("salary"));
			System.out.println("========================================");
		}
	}

	// Method to update employee details
	public int updateData(Employee e, int id) throws SQLException {
		st = con.prepareStatement("UPDATE EMPLOYEE SET name=?, department=?, address=?, salary=? WHERE eid=?");
		st.setString(1, e.getName());
		st.setString(2, e.getDepartment());
		st.setString(3, e.getAddress());
		st.setDouble(4, e.getSalary());
		st.setInt(5, id);

		result = st.executeUpdate();
		return result;
	}

	// Method to delete an employee from the database
	public int deleteData(int id) throws SQLException {
		st = con.prepareStatement("DELETE FROM EMPLOYEE WHERE eid=?");
		st.setInt(1, id);
		result = st.executeUpdate();
		return result;
	}
}

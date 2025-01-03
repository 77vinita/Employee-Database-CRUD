# Employee-Database-CRUD

This project is a simple Employee Management System using Java and JDBC, allowing basic CRUD (Create, Read, Update, Delete) operations on employee data.

## Files

- **Employee.java**: Defines the `Employee` class with fields like ID, name, department, address, and salary.
- **JDBC_Connection.java**: Establishes a connection to the MySQL database.
- **CRUDOperations.java**: Contains methods for performing CRUD operations on the EMPLOYEE table.
- **Main.java**: The main class that provides a menu for the user to choose an operation.

## How to Run

1. **Set up MySQL**: 
   - Create a database `myDb` and an `EMPLOYEE` table with the necessary columns.
   
2. **Update the Database Connection**:
   - Update the database connection details (URL, username, password) in `JDBC_Connection.java`.

3. **Add MySQL Connector**:
   - Download and add the MySQL JDBC driver (connector) JAR file to your project’s classpath.

4. **Compile and Run**:
   - Compile all Java files and run the `Main.java` file to interact with the system.

## Features

- **Add New Employee**: Insert new employee data.
- **View All Employees**: Display details of all employees.
- **View Employee by ID**: Retrieve details of a specific employee by their ID.
- **Update Employee Details**: Modify details of an existing employee.
- **Delete Employee**: Remove an employee from the database.

--- 

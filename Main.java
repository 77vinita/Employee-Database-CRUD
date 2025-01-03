package com.jdbc_api;

import java.sql.SQLException;
import java.util.Scanner;

//Main class to interact with the user
public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in); // To read user input
		int choice; // To store user choice
		int id; // To store employee ID
		int result; // To store operation result
		Employee emp = new Employee(); // Create an Employee object
		CRUDOperations crud = new CRUDOperations(); // Create a CRUDOperations object

		do {
			// Display menu options
			System.out.println("========================================");
			System.out.println("1.Add new employee");
			System.out.println("2.View all employees details");
			System.out.println("3.View an employee details by id");
			System.out.println("4.Update employee details");
			System.out.println("5.Delete employee/n");
			System.out.println("6.Exit");

			System.out.print("Choose operation: ");
			choice = sc.nextInt(); // Read user choice

			switch (choice) {
			case 1:// Add new employee
				System.out.println("Enter employee details: ");
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Department: ");
				String dep = sc.nextLine();
				System.out.print("Address: ");
				String addr = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				// Set employee details
				emp.setName(name);
				emp.setDepartment(dep);
				emp.setAddress(addr);
				emp.setSalary(salary);
				result = crud.insertData(emp); // Insert data
				if (result > 0) {
					System.out.println("Data inserted successfully!");
				} else {
					System.out.println("Failed to insert data. Please try again");
				}
				break;
			case 2: // View all employees
				System.out.println("Fetching details of all employees....");
				crud.viewAllData();
				break;
			case 3: // View by employee by id
				System.out.println("Enter employee id for details: ");
				id = sc.nextInt();
				System.out.println("Fetching details of employee with ID: " + id);
				crud.viewDataById(id);
				break;
			case 4: // Update employee details
				System.out.print("Enter employee id to update: ");
				id = sc.nextInt();
				System.out.println("Enter updated details: ");
				sc.nextLine(); // Consumes newline
				System.out.print("Name: ");
				String Newname = sc.nextLine();
				System.out.print("Department: ");
				String Newdep = sc.nextLine();
				System.out.print("Address: ");
				String Newaddr = sc.nextLine();
				System.out.print("Salary: ");
				double Newsalary = sc.nextDouble();
				// Set updated employee details
				emp.setName(Newname);
				emp.setDepartment(Newdep);
				emp.setAddress(Newaddr);
				emp.setSalary(Newsalary);
				result = crud.updateData(emp, id);
				if (result > 0) {
					System.out.println("Details updated successfully!");
				} else {
					System.out.println("Failed to update details. Please try again");
				}
				break;
			// Delete employee
			case 5:
				System.out.print("Enter employee id to delete: ");
				id = sc.nextInt();
				result = crud.deleteData(id);
				if (result > 0) {
					System.out.println("Details deleted successfully!");
				} else {
					System.out.println("Failed to delete data. ID may not exist....");
				}
				break;
			case 6: // Exit
				System.out.println("Exiting...Thank you!");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice != 6);
		sc.close();
	}
}

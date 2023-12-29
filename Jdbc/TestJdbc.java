package Jdbc;

//step 1-> import package
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//createTable();
		insertData();
	}

	private static void insertData() throws ClassNotFoundException, SQLException {

		// step2-> Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");// Checked exception
		System.out.println("Driver loaded successfully...");

		// Step3-> Establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");

		if (connection != null) {
			System.out.println("Connected...");
		} else {
			System.out.println("Not connected...");
		}

		// Step4-> Ready the statement to process DML operation or create DDL operation
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter student id"));
		String name = JOptionPane.showInputDialog("Enter student's name");
		String city = JOptionPane.showInputDialog("Enter student's city");
		String query = "insert into student(id,name,city) values(" + id + ",'" + name + "','" + city + "') ";
		Statement statement = connection.createStatement();

		// step5 -> Execute the query statement
		int rows = statement.executeUpdate(query);
		if (rows > 0) {
			System.out.println(rows + " Rows updated..");
		}

		// step6-> Close the connection
		connection.close();
	}

	private static void createTable() {
		try {
			// step2-> Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");// Checked exception
			System.out.println("Driver loaded successfully...");

			// Step3-> Establish connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");

			if (connection != null) 
			{
				System.out.println("Connected...");
			} 
			else 
			{
				System.out.println("Not connected...");
			}

			// Step4-> Ready the statement to process DML operation or create DDL operation
			String query = "create table student(id int primary key, name varchar(40) not null, city varchar(40) )";
			Statement statement = connection.createStatement();

			// step5 -> Execute the query statement
			statement.executeUpdate(query);

			// step6-> Close the connection
			connection.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}

package Jdbc;
/*
 * 1) Write the steps of jdbc with full explaination?
 */
public class TheoryQuestions {
/*1st Step
	  Import JDBC Packages:
      Import the JDBC packages that are needed for database connectivity. 
      The core JDBC packages are part of the java.sql package.
	 */
	/*2nd Step
	 * Load and Register JDBC Driver:
	 * Before establishing a connection to the database, 
	 * you need to load and register the JDBC driver that corresponds to the database you are using
	 * code :-
	 * Class.forName("com.mysql.cj.jdbc.Driver");
	 */
	/*3rd step 
	 * Establish Connection to the Database:
	 * Use the DriverManager.getConnection() method to establish a connection to the database. 
	 * You need to provide the database URL, username, and password.
	 * code :- 
	 * String url = "jdbc:mysql://localhost:3306/deeptech";
       String username = "root";
       String password = "Root";
       Connection connection = DriverManager.getConnection(url, username, password);
	 */
	/*4th step 
	 * Create Statement:
	 * Once the connection is established, 
	 * you need to create a Statement object. The Statement interface is used for executing SQL queries.
	 * code :-
	 * Statement st = connection.createStatement();
	 * 3 types -statement, prepare statement,collable statement
	 * */
	/*5th step 
	 * Execute SQL Queries:
	 * Use the executeQuery() method of the Statement object to execute a SELECT SQL query and retrieve the results.
	 * code :-
	 * String sqlQuery = "SELECT * FROM emp";
       ResultSet resultSet = statement.executeQuery(sqlQuery);
       //For non-SELECT queries (e.g., INSERT, UPDATE, DELETE), you can use the executeUpdate() method.
       String insertQuery = "INSERT INTO your_table (column1, column2) VALUES ('value1', 'value2')";
       int rowsAffected = statement.executeUpdate(insertQuery);
     */
	
	// If your SQL query is a SELECT query, you need to process the result set returned by the database.
	//while (resultSet.next()) {
    // Process each row of the result set
    //  String column1Value = resultSet.getString("column1");
    // int column2Value = resultSet.getInt("column2");
    // ... process other columns
}

	
	/*6th step
	 * close the connection
	 * After finished using the database connection, 
	 * statement, and result set, it's important to close them to free up resources.
	 * resultSet.close();
       statement.close();
       connection.close();
       Closing resources in a finally block ensures that they are closed even if an exception occurs.
	 */
	/*
	 * try {
            Code for database operations
           } catch (SQLException e) 
           {
            e.printStackTrace();
           }
     finally {
         try {
         if (resultSet != null) resultSet.close();
         if (statement != null) statement.close();
         if (connection != null) connection.close();
             } 
         catch (SQLException e) 
         {
         e.getMessage();
         }
            }
 */


//3) What is the role of ResultSet.java interface? How we can make ResultSet cursor bidirectional? 

//Explain with example?
/*In Java, the ResultSet interface is a part of the JDBC API and is used to represent a set of results from a database query. 
 *It provides methods for retrieving and manipulating data returned by a database query. 
 *The ResultSet interface is typically associated with the Statement interface, 
 *which is used to create and execute SQL queries.
 *import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BidirectionalResultSetExample {
//harish chandra mahto
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a Statement with a bidirectional ResultSet
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Execute a query
            String query = "SELECT * FROM your_table";
            ResultSet resultSet = statement.executeQuery(query);

            // Move the cursor to the last row
            resultSet.last();

            // Retrieve data from the last row
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            // Print the data
            System.out.println("ID: " + id + ", Name: " + name);

            // Move the cursor to the previous row
            resultSet.previous();

            // Retrieve data from the previous row
            int previousId = resultSet.getInt("id");
            String previousName = resultSet.getString("name");

            // Print the data
            System.out.println("ID: " + previousId + ", Name: " + previousName);

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

4)What is ResultSetMetaData.java interface? Explain with example? 
The ResultSetMetaData interface in Java is part of the JDBC 
API and is used to retrieve metadata information about the columns of a ResultSet. 
Metadata refers to data that describes the properties of other data, 
and in the context of ResultSetMetaData, it provides information about 
the structure of the result set, such as the number of columns, 
the name of each column, the type of data in each column, and other details.
example 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataExample {
//harish chandra mahto
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a Statement
            Statement statement = connection.createStatement();

            // Execute a query
            String query = "SELECT id, name, age FROM your_table";
            ResultSet resultSet = statement.executeQuery(query);

            // Get ResultSetMetaData
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Retrieve and print column information
            int columnCount = metaData.getColumnCount();
            System.out.println("Number of columns: " + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + " name: " + metaData.getColumnName(i));
                System.out.println("Column " + i + " type: " + metaData.getColumnTypeName(i));
                System.out.println("Column " + i + " size: " + metaData.getColumnDisplaySize(i));
                System.out.println("-----------");
            }

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
5) What are the different types of drivers? Explain type3 and type4 drivers in jdbc?
-->In JDBC (Java Database Connectivity), there are four types of database drivers, each with its own characteristics and advantages. The different types of JDBC drivers are:

Type 1: JDBC-ODBC Bridge Driver
Type 2: Native-API Driver
Type 3: Network Protocol Driver
Type 4: Thin or Direct-to-Database Driver

Type 3: Network Protocol Driver
Description:

Also known as the middleware driver, this type uses a middle-tier server that translates JDBC calls into a database-independent network protocol.
The middle-tier server then communicates with the database using the database-specific protocol.
It provides flexibility and independence from the database vendor on the client side.
Type 4: Thin or Direct-to-Database Driver :
Description:

Also known as the thin driver, this type communicates directly with the database server using a database-specific protocol.
The driver converts JDBC calls into the network protocol used by the database server, bypassing the need for middleware.
It is a pure Java driver that is platform-independent and does not rely on native code.




6) What is the difference between Statement and PreparedStatement object in jdbc? Explain with example?
--->I. Statement:
Description:

The Statement interface is used to execute simple SQL queries without parameters.
SQL queries are directly embedded within the Java code as strings.



II. PreparedStatement:
Description:

The PreparedStatement interface is an extension of Statement and is used to execute precompiled SQL queries with parameters.
It allows the use of placeholders in the SQL query, making it more efficient and secure.
Performance:
 * 
 * */

package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//HARISH CHANDRA MAHTO
//A) DDL and DML operation using Statement.java interface:
//B) DDL and DML operation using PreparedStatement.java interface:
//C) DDL, DML, and DQL operation using execute() method:
//D) DDL and DML operation using executeUpdate() method:
public class StatementExample {
    public static void main(String[] args) {
        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");

            // Create a Statement
            Statement statement = connection.createStatement();

            // DDL Operation (Create Table)
            String ddlQuery = "CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY auto_increment, name VARCHAR(255))";
            statement.execute(ddlQuery);

            // DML Operation (Insert Data)
            String dmlQuery = "INSERT INTO example_table VALUES (1, 'Harish')";
            int rowsAffected = statement.executeUpdate(dmlQuery);
            System.out.println("Rows affected: " + rowsAffected);

            // Close resources
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//*************************************************************************************************************************
//(B)
//public class PreparedStatementExample {
//    public static void main(String[] args) {
//        try {
//            // Establish a connection to the database
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");
//
//            // Create a PreparedStatement for DDL Operation (Create Table)
//            String ddlQuery = "CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY, name VARCHAR(255))";
//            PreparedStatement ddlStatement = connection.prepareStatement(ddlQuery);
//            ddlStatement.execute();
//
//            // Create a PreparedStatement for DML Operation (Insert Data)
//            String dmlQuery = "INSERT INTO example_table VALUES (?, ?)";
//            PreparedStatement dmlStatement = connection.prepareStatement(dmlQuery);
//            dmlStatement.setInt(1, 2);
//            dmlStatement.setString(2, "Alice");
//            int rowsAffected = dmlStatement.executeUpdate();
//            System.out.println("Rows affected: " + rowsAffected);
//
//            // Close resources
//            ddlStatement.close();
//            dmlStatement.close();
//            connection.close();
//
//        } 
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//************************************************************************************************************************
//(C)
//The execute() method can be used for any type of SQL statement (DDL, DML, or DQL).

//public class ExecuteExample {
//    public static void main(String[] args) {
//        try {
//            // Establish a connection to the database
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");
//
//            // Create a Statement
//            Statement statement = connection.createStatement();
//
//            // DDL Operation (Create Table)
//            String ddlQuery = "CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY, name VARCHAR(20))";
//            statement.execute(ddlQuery);
//
//            // DML Operation (Insert Data)
//            String dmlQuery = "INSERT INTO example_table VALUES (1, 'harish')";
//            statement.execute(dmlQuery);
//
//            // DQL Operation (Select Data)
//            String dqlQuery = "SELECT * FROM example_table";
//            ResultSet resultSet = statement.executeQuery(dqlQuery);
//
//            // Process the result set
//
//            // Close resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//
//        } 
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//************************************************************************************************************************
//(D)
//The executeUpdate() method is typically used for DDL and DML operations.
//public class ExecuteUpdateExample {
//    public static void main(String[] args) {
//        try {
//            // Establish a connection to the database
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");
//
//            // Create a Statement
//            Statement statement = connection.createStatement();
//
//            // DDL Operation (Create Table)
//            String ddlQuery = "CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY, name VARCHAR(20))";
//            int ddlRowsAffected = statement.executeUpdate(ddlQuery);
//            System.out.println("DDL Rows affected: " + ddlRowsAffected);
//
//            // DML Operation (Insert Data)
//            String dmlQuery = "INSERT INTO example_table VALUES (1, 'John')";
//            int dmlRowsAffected = statement.executeUpdate(dmlQuery);
//            System.out.println("DML Rows affected: " + dmlRowsAffected);
//
//            // Close resources
//            statement.close();
//            connection.close();
//
//        } 
//           catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//

package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection establishConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return null;
	}

	public static Connection establishConnectionWithOracle() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/deeptech";
		String username = "root";
		String password = "Root";
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "Root");

		return null;
	}

}

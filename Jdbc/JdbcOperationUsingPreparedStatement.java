package Jdbc;
import java.sql.*;
import java.util.*;
public class JdbcOperationUsingPreparedStatement {
	public static void main (String args[])
	{
		saveRecord();

	}	
	private static void saveRecord() {
		Connection connection = null;
		//Statement statement = null;
		PreparedStatement prepareStatement = null;
		Scanner s = null;
		try {
			// this is step3
			connection = DbConnection.establishConnection();
			
			//step 4 -> ready to statement to process SQl query
			//statement = connection.createStatement();
			prepareStatement = connection.prepareStatement("insert into student(city,name,id) values(?,?,?)");
			s = new Scanner(System.in);
			System.out.println("Enter city name");
			String city = s.next();
			System.out.println("Enter student name");
			String name = s.next();
			System.out.println("Enter student id");
			int id = s.nextInt();
			
			prepareStatement.setInt(3, id);
			prepareStatement.setString(1, city);
			prepareStatement.setString(2, name);
			
			//step5 -> execute the query
//			s = new Scanner(System.in);
//			System.out.println("Enter city name");
//			String city = s.next();
//			System.out.println("Enter student name");
//			String name = s.next();
//			System.out.println("Enter student id");
//			int id = s.nextInt();
//			int rows = statement.executeUpdate("insert into student(city,name,id) values('"+city+"', '"+name+"',"+id+")");
			
			int rows = prepareStatement.executeUpdate();
			if(rows>0) {
				System.out.println("Data has been saved successfully");
			}else {
				System.out.println("Something went wrong to save record..");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection != null) {
				try {
//					if(statement != null) {
//						statement.close();
//					}
					if(prepareStatement != null) {
						prepareStatement.close();
					}
					connection.close();
					if(s!=null) {
						s.close();
					}
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
		}
		
	}

}
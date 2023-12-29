package Jdbc;
	//Crud operation using PreparedStatement object:
	//==============================================


		//JdbcUsingPreparedStatement.java:
		//--------------------------------


		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.ResultSetMetaData;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Scanner;

		public class JdbcUsingPreparedStatement {

			public static void main(String[] args) {

//			saveCustomer();
			updateCustomer();
//				deleteCustomer();
//				showAllCustomer();
//				searchCustomer();
				
//				cursorCanMoveBothDirection();
//				displayColumnName();
			}
			
			private static void displayColumnName() {
				Connection con = null;
				PreparedStatement ps = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					ps = con.prepareStatement("select * from tbl_customer");
					ResultSet rs = ps.executeQuery();	
					ResultSetMetaData metaData = rs.getMetaData();
					System.out.println(metaData.getColumnName(1)+"   "+metaData.getColumnName(2)+"   "+metaData.getColumnName(3));
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String city = rs.getString(3);
						System.out.println(id+"      "+name+"     "+city);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//step 6
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}

			private static void cursorCanMoveBothDirection() {
				Connection con = null;
				PreparedStatement ps = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					//Uni-directional cursor
					//ps = con.prepareStatement("select * from tbl_customer");
					//Bi-directional cursor
					ps = con.prepareStatement("select * from tbl_customer",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs = ps.executeQuery();
					rs.absolute(5);
					while(rs.previous()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String city = rs.getString(3);
						System.out.println("Id: "+id+" Name: "+name+" City: "+city);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//step 6
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
				
			}

			static void saveCustomer() {
				Connection con = null;
				PreparedStatement ps = null;
				Scanner s = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					//st = con.createStatement();
					ps = con.prepareStatement("insert into tbl_customer(c_id,c_name,c_city) values(?,?,?)");
					s = new Scanner(System.in);
					System.out.println("Enter customer id");
					int id = s.nextInt();
					ps.setInt(1, id);
					System.out.println("Enter customer name");
					String name = s.next();
					ps.setString(2, name);
					System.out.println("Enter customer city");
					String city = s.next();
					ps.setString(3, city);
					//step5
					
					//int rows = st.executeUpdate("insert into tbl_customer(c_id,c_name,c_city) values("+id+",'"+name+"','"+city+"')");
					int rows = ps.executeUpdate();
					if(rows>0) {
						System.out.println("Record is saved successfully");
					}else {
						System.out.println("Failed to save record");
					}
					
					showAllCustomer();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}

			static void updateCustomer() {

				Connection con = null;
				PreparedStatement ps = null;
				Scanner s = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					//st = con.createStatement();
					ps = con.prepareStatement("update tbl_customer set c_city = ? where c_id = ?");
					s = new Scanner(System.in);
					System.out.println("Enter customer id");
					int id = s.nextInt();
					ps.setInt(2, id);
					System.out.println("Enter customer city");
					String city = s.next();
					ps.setString(1, city);
					//step5
					
					//int rows = st.executeUpdate("update tbl_customer c_city = '"+city+"' where c_id = "+id+" ");
					int rows = ps.executeUpdate();
					if(rows>0) {
						System.out.println("Record is updated successfully");
					}else {
						System.out.println("Failed to update record");
					}
					
					showAllCustomer();
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}

			static void deleteCustomer() {
				
				Connection con = null;
				PreparedStatement ps = null;		
				try {
					con = DbConnection.establishConnectionWithOracle();
					//st = con.createStatement();
					ps = con.prepareStatement("delete tbl_customer where c_id = ? ");
					Scanner s = new Scanner(System.in);
					System.out.println("Enter id to delete record");
					int id = s.nextInt();
					//step5
					
					//int rows = st.executeUpdate("delete tbl_customer where c_id = "+id+" ");
					int rows = ps.executeUpdate();
					if(rows>0) {
						System.out.println("Record is deleted successfully");
					}else {
						System.out.println("Failed to delete record");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}

			static void showAllCustomer() {

				Connection con = null;
				PreparedStatement ps = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					//step 4
					ps = con.prepareStatement("select * from tbl_customer");
					
					//step 5
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String city = rs.getString(3);
						System.out.println("Id: "+id+" Name: "+name+" City: "+city);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//step 6
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}

			static void searchCustomer() {
				Connection con = null;
				PreparedStatement ps = null;
				try {
					con = DbConnection.establishConnectionWithOracle();
					//step 4
					//st = con.createStatement();
					ps = con.prepareStatement("select * from tbl_customer where c_id= ? ");
					//step 5
					Scanner s = new Scanner(System.in);
					System.out.println("Enter id to search record");
					int id = s.nextInt();
					ps.setInt(1, id);
					//ResultSet rs = st.executeQuery("select * from tbl_customer where c_id= "+id+" ");
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						int cid = rs.getInt(1);
						String name = rs.getString(2);
						String city = rs.getString(3);
						System.out.println("Id: "+cid+" Name: "+name+" City: "+city);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//step 6
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
		}

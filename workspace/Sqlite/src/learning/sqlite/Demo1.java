package learning.sqlite;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class Demo1 {
	
	public static Connection connect(){
		 
		Connection conn =null;
        // create a connection to the database
		try {
//			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:StudentDB.sqlite";
			 conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established.");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Message: "+e.getMessage());
			return null;
		}
//		 catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
		
		
        
        
	}
	
	public static void main(String[] args) {
		     Connection c = connect();
		     PreparedStatement preparedStatement ;
		     ResultSet resultSet ;
//		     String sql ="SELECT * FROM Student where username = ?";
//		     String sql ="update student set username = ? where username = ?";
		     String sql ="SELECT * FROM Student ";
		     
		     if(c==null){
		    	 System.out.println("Connection returned with null value");
		     }else{
		    	 try {
					preparedStatement =c.prepareStatement(sql);
//					preparedStatement.setString(1, "rahul");
//					preparedStatement.setString(1, "Varun");
//					preparedStatement.setString(2, "rahul");
//					 preparedStatement.executeUpdate();
				 resultSet=preparedStatement.executeQuery();
				 System.out.println(resultSet.getString(1));
				
				
				 System.out.println("Before");
					while(resultSet.next()){
						System.out.println(resultSet.getString(1));
					}
//				
//					if(resultSet.next()){
////						System.out.println(resultSet.getCursorName());
//						System.out.println(resultSet.getString("age"));
//						System.out.println(resultSet.getString(1));
//						
//					}
//					if(resultSet.next()){
////						System.out.println(resultSet.getCursorName());
//						System.out.println(resultSet.getString("age"));
//						System.out.println(resultSet.getString(1));
//						
//					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Check1");
				}
		     }
		     
	}

}

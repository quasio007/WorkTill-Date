package basic.tutorial;

import java.sql.*;


public class Demo1 {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/demo";
		String user ="root";
		String password ="123456";
		String sql ="Select * from Student";
		
//		String sql ="Select * from Student where studentId = ?";
//		PreparedStatement preparedStatement =null;
		Statement statement =null;
		ResultSet resultSet =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn =DriverManager.getConnection(url, user, password);
//			preparedStatement = conn.prepareStatement(sql);
//			preparedStatement.setString(1, "1");
//			resultSet =preparedStatement.executeQuery();
			
			 statement =conn.createStatement();
			 
			 resultSet =statement.executeQuery(sql);

			while(resultSet.next()){
				System.out.println("Name: "+resultSet.getString(3));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		}finally{
			statement.close();
			resultSet.close();
//			preparedStatement.close();
		}
	}

}

package basic.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class FetchingDetailsFromProrertyFile {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

		Properties prop = new Properties();
		prop.load(new FileInputStream("jdbc.properties"));
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		String driverClassName = prop.getProperty("driverClassName");
		String sql = "Select * from Student";
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(driverClassName);
			Connection conn = DriverManager.getConnection(url, user, password);

			statement = conn.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString(3));

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			statement.close();
			resultSet.close();

		}
	}

}

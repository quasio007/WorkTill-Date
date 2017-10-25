package application.login.with.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteConnection {
public static Connection connect(){
	try {
		String url = "jdbc:sqlite:StudentDB.sqlite";
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection(url);
		return conn;
	} catch (Exception e) {
		System.out.println(e.getMessage());
		return null;
	}
};
}

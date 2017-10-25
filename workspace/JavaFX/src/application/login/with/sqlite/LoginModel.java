package application.login.with.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
	private Connection connection;

	public LoginModel() {
		this.connection = SqliteConnection.connect();
		if (connection == null) {
			System.out.println("Unable to Stablish a successfull connection");
			System.exit(0);
		}
	}

	public boolean isDBConnected() {
		try {
			if (!connection.isClosed()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean credentialsValidation(String userName, String pass) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement("Select * from Student where username = ? and pass = ?");
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, pass);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				// System.out.println("Success : Records Found for provided
				// details.");
				return true;
			} else {
				// System.out.println("Failure : No Records Found for provided
				// details.");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				preparedStatement.close();
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

	}

}

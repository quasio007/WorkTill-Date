package application.loginApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private TextArea area;
	@FXML
	private TextField userName;

	@FXML
	private PasswordField password;

	public void Login(ActionEvent event) throws Throwable {
		if (userName.getText().equals("Mohit") && password.getText().equals("pass")) {
			area.setText("Success");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("MainWindow");
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			area.setText("Failure");
		}

	}

}

package application.login.with.sqlite;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML
	private PasswordField pass;
	@FXML
	private TextField user;
	@FXML
	private Label label, label1;

	private LoginModel loginModel = new LoginModel();

	public void OnClick(ActionEvent e) throws Exception {
		if (loginModel.credentialsValidation(user.getText(), pass.getText())) {
			label1.setText("Success");
			((Node)e.getSource()).getScene().getWindow().hide();
			Stage primaryStage =new Stage();
			FXMLLoader loader =new FXMLLoader();
			Parent root =loader.load(getClass().getResource("UserPage.fxml").openStream());
			UserPageController userPageController =loader.getController();
			userPageController.setLabel(user.getText());
			Scene scene =new Scene(root);
			primaryStage.setTitle("User Information");
			primaryStage.setScene(scene);
			primaryStage.show();

		} else {
			label1.setText("Failure");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		label.setText(String.valueOf(loginModel.isDBConnected()));
	}

}

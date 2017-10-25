package application.login.with.sqlite;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class UserPageController {
	@FXML
	private Label label2;
	
	public void setLabel(String userName){
		label2.setText(userName);
	}
	
	
public void afterClick(ActionEvent e) throws IOException{
	((Node)e.getSource()).getScene().getWindow().hide();
	Stage primaryStage =new Stage();
	Parent root =FXMLLoader.load(getClass().getResource("Login.fxml"));
	Scene scene =new Scene(root);
	primaryStage.setTitle("Login");
	primaryStage.setScene(scene);
	primaryStage.show();
}
}

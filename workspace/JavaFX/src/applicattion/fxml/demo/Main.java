package applicattion.fxml.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FxmlFile.fxml"));
		Scene scene = new Scene(root);
		 scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("FXML Application");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}

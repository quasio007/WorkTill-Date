package application.basics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

public class Main extends Application {
	private int count = 0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			// Define Components like buttons :
			Button button = new Button("Click Me");
			Button exit = new Button("Exit");
			button.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					System.out.println("Button Clicked '" + count + "' times");
					count++;
				}
			});
			exit.setOnAction(s -> {
				System.out.println("Exit button clicked");
				System.out.println("exiting the application...");
				System.exit(0);
			});

			// Set layout:
			// StackPane stack = new StackPane();
			// BorderPane border = new BorderPane(button);
			VBox vBox = new VBox();

			// Add components to layout:
			// stack.getChildren().add(exit);
			// border.getChildren().add(button);
			vBox.getChildren().addAll(button, exit);

			// Create a scene and add the layout having components into it:
			Scene scene = new Scene(vBox, 300, 300);
			// Scene scene =new Scene(border,300,300);
			// Scene scene = new Scene(stack, 300, 300);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Add Scene to Stage:
			primaryStage.setTitle("Learning JavaFX");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}

}

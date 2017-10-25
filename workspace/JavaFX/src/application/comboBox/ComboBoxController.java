package application.comboBox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class ComboBoxController implements Initializable {
	@FXML
	private ComboBox<String> comboBox;
	@FXML
	private Button button;

	@FXML
	private TextArea area;

	ObservableList<String> list = FXCollections.observableArrayList("Mohit", "Rohit", "Rahul", "Sohan");

	@FXML
	public void addMoreNames(ActionEvent event) {
		comboBox.getItems().addAll("Adam", "Eve");
	}

	@FXML
	public void setNameInTextArea(ActionEvent event) {

		area.setText(comboBox.getValue());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		comboBox.setItems(list);
	}
}

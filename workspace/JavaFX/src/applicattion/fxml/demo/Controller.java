package applicattion.fxml.demo;

import java.io.InputStream;
import java.util.Properties;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
@FXML
private TextArea area;

@FXML
private TextField field1;

@FXML
private TextField field2;

@FXML
private Button button1;

@FXML
	public void add(ActionEvent e) throws Exception{
		Integer num1 =Integer.parseInt(field1.getText());
		Integer num2 =Integer.parseInt(field2.getText());
		int sum =num1+num2;
		InputStream is =Controller.class.getResourceAsStream("/rsc/propertiesFiles/a.properties");
		Properties prop = new Properties();
		prop.load(is);
		String name = prop.getProperty("name");
		
		area.setText("Sum of two numbers is: "+Integer.toString(sum)+" and name from property file is : '"+name+"'");
	}
}

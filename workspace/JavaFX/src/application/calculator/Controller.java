package application.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	@FXML
private Label label;
private double number1=0;
private String operator ="";
private Model model =new Model();
private boolean flag =true;
	@FXML
	public void pressNumber(ActionEvent e){
		if(flag){
			flag=false;
			label.setText("");
		}
		
		String value =((Button) e.getSource()).getText();
		label.setText(label.getText()+value);
		
	
	}
	@FXML
	public void pressOperator(ActionEvent e){
		String value =((Button) e.getSource()).getText();
		if(!value.equalsIgnoreCase("=")){
			if(!operator.isEmpty())
				return;
			operator=value;
			number1 =Double.parseDouble(label.getText());
			label.setText("");
		}
		else{
			if(operator.isEmpty())
				return;
			double number2 =Double.parseDouble(label.getText());
			Double finalResult= model.calculate(number1, number2, operator);
			label.setText(String.valueOf(finalResult));
			operator ="";
			flag=true;
		}
	}
}

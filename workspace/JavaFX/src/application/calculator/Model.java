package application.calculator;

public class Model {
	public Double calculate(double number1, double number2, String operator) {
		Double result = 0.0;

		switch (operator) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			if (number2 == 0) {
				result = 0.0;
			} else {
				result = number1 / number2;
			}

			break;
			default:
				result =0.0;

		}

		return result;
	}
}

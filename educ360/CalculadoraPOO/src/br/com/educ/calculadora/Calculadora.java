package br.com.educ.calculadora;

public class Calculadora {

	public double calcular(double value1, double value2, char operator) {
		switch(operator) {
			case '+': 
				return sum(value1, value2);
			case '-': 
				return subtract(value1, value2);
			case '*': 
				return multiply(value1, value2);
			case '/': 
				return divide(value1, value2);
			case '^': 
				return potentiation(value1, value2);
			default: 
				return 0;
		}
	}

	private double sum(double value1, double value2) {
		return value1 + value2;
	}

	private double subtract(double value1, double value2) {
		return value1 - value2;
	}

	private double multiply(double value1, double value2) {
		return value1 * value2;
	}

	private double divide(double value1, double value2) {
		if (value2 != 0)
			return value1 / value2;
		else
			return 0;
	}
	private double potentiation(double value1, double value2) {
		return Math.pow(value1, value2);
		
	}

}

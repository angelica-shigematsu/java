package br.com.educ.calculadora;

public class Calculadora {

	private double value1;
	private double value2;
	private double operator;
	
	public Calculadora(double value1, double value2, char operator) {
		this.value1 = value1;
		this.value2 = value2;
		this.operator = operator;
	}
	
	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public double getOperator() {
		return operator;
	}

	public void setOperator(double operator) {
		this.operator = operator;
	}

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
		return value1 / value2;
	}

}

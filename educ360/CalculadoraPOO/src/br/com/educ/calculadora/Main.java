package br.com.educ.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double num1 = 0, num2 = 0;
		char operator;
		char attempts = 'n';

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite 1 º número: ");
			num1 = scan.nextDouble();

			System.out.println("Digite 2 º número: ");
			num2 = scan.nextDouble();

			System.out.println("Digite o operador ");
			operator = scan.next().charAt(0);

			Calculadora cal = new Calculadora();

			System.out.println(cal.calcular(num1, num2, operator));
			
			System.out.println("Deseja continuar (s/n): ");
			attempts = scan.next().charAt(0);
			
		}while(attempts == 's' || attempts == 'S');
		scan.close();

	}

}

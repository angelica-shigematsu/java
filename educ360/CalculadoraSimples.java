import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double value1 = 0, value2 = 0, result = 0;

		String operatorName = "";
		char operator;
		char sum = '+';
		char subtract = '-';
		char multiply = '*';
		char divide = '/';
		
		boolean exitsError = false;
		int divideByZero = 0;
		String messageError = "";
		
		try {

			System.out.println("Digite o 1º valor: ");
			value1 = scan.nextDouble();
	
			System.out.println("Digite o 2º valor: ");
			value2 = scan.nextDouble();
	
			System.out.println("Digite o operador (+,-,*,/) ");
			operator = scan.next().charAt(0);
	
			if (operator == sum) {
				result = value1 + value2;
				operatorName = "soma";
			} else if (operator == subtract) {
				result = value1 - value2;
				operatorName = "subtração";
			} else if (operator == multiply) {
				result = value1 * value2;
				operatorName = "multiplicação";
			}else if (operator == divide && value2 != divideByZero) {
				result = value1 / value2;
				operatorName = "divisão";
			}else if(value2 == divideByZero){
				exitsError = true;
				messageError = "não pode dividir por zero";
			}else{
				exitsError = true;
				messageError = "não existe esse operador";
			}
			
			
			if(exitsError) {
				System.out.println("Erro: " + messageError);
			}else {
				System.out.println("Valor " + operatorName + " é : " + result);
			}
		}catch(InputMismatchException e) {
			System.out.println("Entrada de tipo de dados errado");
		}
		scan.close();
	}

}

package br.com.educ.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String title;
		int option = 0;
		
		ListTask task = new ListTask();
		
		try {
			while(option != 6) {
				
				System.out.println("--------------------------------");
				System.out.println("Escolha uma das opções");
				System.out.println("1- Adicionar na lista");
				System.out.println("2- Remover da lista");
				System.out.println("3- Mostrar a lista");
				System.out.println("4- Mostrar a lista em ordem alfabética");
				System.out.println("5- Mostrar a lista em ordem descrescente");
				System.out.println("6- Sair: ");
				option = scan.nextInt();
				
				System.out.println("--------------------------------");
				switch(option) {
					case 1: 
						System.out.println("Digite o nome da tarefa para adicionar: ");
						title = scan.next();
						task.addTask(title);
						continue;
					case 2:
						System.out.println("Digite o nome da tarefa para remover: ");
						title = scan.next();
						task.removeTask(title);
						continue;
					case 3:
						task.listTasks();
						continue;
					case 4: 
						task.listOrderASC();
						continue;
					case 5:
						task.listOrderDESC();
						continue;
					case 6:
						break;
				}
			}
		}catch(InputMismatchException e) {
			System.out.println("Digite um valor válido!");
		}
		scan.close();	
	}

}

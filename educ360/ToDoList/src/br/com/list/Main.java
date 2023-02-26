package br.com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Task> list = new ArrayList<Task>();

		Scanner scan = new Scanner(System.in);
		
		String task1;
		String startDay;
		int option = 0;
		
		while(option != 6) {
			System.out.println("------------------------------------");
			System.out.println("\tEscolha uma das opções: ");
			System.out.println("1- Adicionar na lista ");
			System.out.println("2- Remover da lista ");
			System.out.println("3- Listar as tarefas ");
			System.out.println("4- Listar ordem alfabética ");
			System.out.println("5- Listar ordem descrecente ");
			System.out.println("6- Listar por ordem cronológica");
			System.out.println("7- Sair");
			
			option = scan.nextInt();
			System.out.println("------------------------------------");
			
			switch(option) {
				case 1: 
					scan = new Scanner(System.in);
					Task task = new Task();
					System.out.println("Digite uma tarefa: ");
					task1 = scan.nextLine();
					System.out.println("Digite o dia da tarefa: ");
					startDay = scan.nextLine();
					task.setName(task1);
					task.setDate(startDay);
					list.add(task);
					break;
				case 2: 
					System.out.println("Digite uma tarefa: ");
					task1 = scan.next();
					for(int index = 0; index < list.size(); index ++) {
						if(list.get(index).getName().equals(task1)) {
							list.remove(index);
							System.out.println("Foi removido a tarefa!");
						}
					}
					break;
				case 3:
					for(int index = 0; index < list.size(); index ++) {
						System.out.println(list.get(index).getName());
						System.out.println(list.get(index).getDate());
					}
					break;
				case 4:
					ArrayList<Task> sortName = new ArrayList<>(list);
					//Collections.sort(sortName);
					for (Task name : sortName) {
					    System.out.println(name.getName());
					}
					break;
				case 5: 
					ArrayList<Task> orderName = new ArrayList<>(list);
					Collections.reverse(orderName);
					for (Task name : orderName) {
					    System.out.println(name.getName());
					}
					break;
				case 6: 
					ArrayList<Task> listByDate = new ArrayList<>(list);
					
					Collections.sort(listByDate, Comparator.comparing(Task::getDate));

					 for(Task date: listByDate){
				            System.out.println(date.getDate() + " " + date.getName());
				        }
					break;
				case 7:
					System.out.println("Programa encerrado!");
					break;
				default: 
					System.out.println("Erro! Não existe essa opção");
			}
		}
		scan.close();
	}
	
}

package br.com.bancodigital.view;

import java.util.Scanner;

import br.com.bancodigital.entity.ContaPoupanca;
import br.com.bancodigital.service.ClienteService;
import br.com.bancodigital.service.ContaPoupancaService;

public class Menu {
	ClienteService serviceCliente = new ClienteService();
	ContaPoupancaService servicePoupanca = new ContaPoupancaService();
	Scanner scan = new Scanner(System.in);
	int opcao = 0; 
	
	
	public Menu() {
		
		System.out.println("Bem vindo ao Banco Digital");
		
		clienteMenu();
		
	}
	public void clienteMenu() {

		String nome;
		String cpf;
		String senha;
		int clienteId;
		
		
		System.out.println("Digite o nome do cliente: ");
		nome = scan.next();
		System.out.println("Digite o cpf: ");
		cpf = scan.next();
		System.out.println("Digite o senha: ");
		senha = scan.next();
		if(serviceCliente.adicionarCliente(nome, cpf, senha)) {
			clienteId = serviceCliente.getUltimoClienteId();
			contaMenu(clienteId);
		}
		else
			System.out.println("CPF e senha inválidos. Tente de novo.");
	}
	
	public void contaMenu(int id) {
		
		System.out.println("1- Conta Poupanca: ");
		System.out.println("2- Conta Corrente: ");
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				servicePoupanca.adicionarContaPoupanca(id);
				break;
			case 2: 
				break;
		}
	}
}

package br.com.bancodigital.view;

import java.util.Scanner;

import br.com.bancodigital.entity.Cliente;
import br.com.bancodigital.entity.ContaPoupanca;
import br.com.bancodigital.service.ClienteService;
import br.com.bancodigital.service.ContaPoupancaService;

public class Menu {
	ClienteService serviceCliente = new ClienteService();
	ContaPoupancaService servicePoupanca = new ContaPoupancaService();
	Scanner scan = new Scanner(System.in);
	int opcao = 0; 
	String cpf;
	String senha;
	double valor = 0.0;
	int id, idClienteDestino ;
	boolean verificadoOperacao;
	
	public Menu() {
		
		System.out.println("--------Bem vindo ao Banco Digital------------");
		
		contaMenu();
		
	}
	
	public void contaMenu() {
		Cliente cliente;
		do {
		System.out.println("\nEscolha uma das opções:");
		System.out.println("1- Tranferir conta");
		System.out.println("2- Sacar");
		System.out.println("3- Depositar");
		System.out.println("4- Criar conta");
		System.out.println("5- Listar Cliente");
		System.out.println("6- Saldo");
		System.out.println("7- Sair");
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1: 
				System.out.println("Digite o id do cliente: ");
				id = scan.nextInt();
				System.out.println("Digite o senha do cliente: ");
				senha = scan.next();
				System.out.println("Digite o id do cliente destino: ");
				idClienteDestino = scan.nextInt();
				System.out.println("Valor a transferir: ");
				valor = scan.nextDouble();
				servicePoupanca.transferir(valor, id, senha, idClienteDestino);
				break;
			case 2:
				System.out.println("Digite o id do cliente: ");
				id = scan.nextInt();
				System.out.println("Digite o senha do cliente: ");
				senha = scan.next();
				System.out.println("Valor a sacar: ");
				valor = scan.nextDouble();
				servicePoupanca.sacar(valor, id, senha);
				break;
			case 3:
				System.out.println("Digite o id do cliente: ");
				id = scan.nextInt();
				System.out.println("Digite o senha do cliente: ");
				senha = scan.next();
				System.out.println("Valor a depositar: ");
				valor = scan.nextDouble();
				verificadoOperacao = servicePoupanca.depositar(valor, id, senha);
				
				if(verificadoOperacao) System.out.println("\nDepositado com sucesso");
				else System.out.println("\nErro ao depositar dinheiro");
				break;
			case 4: 
				clienteMenu();
				break;
			case 5: 
				System.out.println("Digite o id do cliente: ");
				id = scan.nextInt();
				cliente = serviceCliente.listarCliente(id);
				System.out.println("\n------Informações do cliente:" + cliente.getNome());
				System.out.println("Id: " + cliente.getId());
				System.out.println("CPF: " + cliente.getCpf());
				System.out.println("Nome: " + cliente.getNome());
				break;
			case 6: 
				System.out.println("Digite o id do cliente: ");
				id = scan.nextInt();
				System.out.println("Digite o senha do cliente: ");
				senha = scan.next();
				System.out.println(servicePoupanca.listarSaldo(id, senha));
				break;
			case 7: 
				break;
			}
		}while(opcao!= 7);
		
	}
	public void clienteMenu() {

		Cliente cliente = new Cliente();
		String nome;
		int clienteId;
		
		
		System.out.println("Digite o nome do cliente: ");
		nome = scan.next();
		System.out.println("Digite o cpf: ");
		cpf = scan.next();
		System.out.println("Digite o senha: ");
		senha = scan.next();
		if(serviceCliente.adicionarCliente(nome, cpf, senha)) {
			clienteId = serviceCliente.getUltimoClienteId();
			System.out.println("Cliente adicionado com sucesso!");
			System.out.println("Id: " + clienteId);
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

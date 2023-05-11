package br.com.bancodigital.service;

import java.util.Random;

import br.com.bancodigital.dao.ContaPoupancaDao;
import br.com.bancodigital.entity.Cliente;
import br.com.bancodigital.entity.ContaPoupanca;

public class ContaPoupancaService {
	
	ClienteService serviceCliente = new ClienteService();

	ContaPoupancaDao dao = new ContaPoupancaDao();

	public boolean adicionarContaPoupanca(int clienteId) {

		Random gerador = new Random();

		int numeroConta = gerador.nextInt(10000, 99999);
		double saldo = 0.0;

		ContaPoupanca poupanca = new ContaPoupanca(clienteId, numeroConta, saldo);
		if (dao.adicionarConta(poupanca)) {
			System.out.println("Adicionado com sucesso a conta");
		} else {
			System.out.println("Tente mais uma vez");
		}
		return true;
	}

	public boolean sacar(double valor, int id, String senha) {
		if(valor < 0) return false;
		
	
		if(!serviceCliente.validarSenha(senha)) return false;
		
//		if(!serviceCliente.validarLogin(id, senha)) return false;
		
		dao.sacar(id, valor);
		
		System.out.println("Sacado com sucesso");
		return true;
	}
	
	public boolean depositar(double valor, int id, String senha) {
		if(valor < 0) return false;
		
	
		if(!serviceCliente.validarSenha(senha)) return false;
		
//		if(!serviceCliente.validarLogin(id, senha)) return false;
		
		dao.depositar(valor, id);

		return true;
	}
	
	public double listarSaldo(int id, String senha) {
	
		if(!serviceCliente.validarSenha(senha)) return 0;
		
//		if(!serviceCliente.validarLogin(id, senha)) return false;
		
		return dao.mostrarSaldo(id);
	}
	
	public boolean transferir(double valor, int id, String senha, int idClienteDestino) {
		if(valor < 0) return false;
		
		if(id < 0) return false;
		
		if(idClienteDestino < 0) return false;
		
		if(!serviceCliente.validarSenha(senha)) return false;
		
//		if(!serviceCliente.validarLogin(id, senha)) return false;
		
		dao.transferir(valor, id, idClienteDestino);

		System.out.println("Transferido com sucesso");
		return true;
	}

}

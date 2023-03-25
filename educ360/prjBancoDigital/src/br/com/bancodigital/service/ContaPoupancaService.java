package br.com.bancodigital.service;

import java.util.Random;

import br.com.bancodigital.dao.ContaPoupancaDao;
import br.com.bancodigital.entity.ContaPoupanca;

public class ContaPoupancaService {

	ContaPoupancaDao dao = new ContaPoupancaDao();
	public boolean adicionarContaPoupanca(int clienteId) {
		
		Random gerador = new Random();
		
		int numeroConta = gerador.nextInt(10000, 99999);	
		double saldo = 0.0;

		ContaPoupanca poupanca = new ContaPoupanca(clienteId, numeroConta, saldo);
			if(dao.adicionarConta(poupanca)) {
				System.out.println("Adicionado com sucesso a conta");
			} else {
				System.out.println("Tente mais uma vez");
			}
			return true;
		}
}

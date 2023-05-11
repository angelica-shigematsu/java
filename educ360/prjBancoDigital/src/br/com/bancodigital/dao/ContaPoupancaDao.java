package br.com.bancodigital.dao;

import java.util.ArrayList;

import br.com.bancodigital.entity.Cliente;
import br.com.bancodigital.entity.ContaPoupanca;

public class ContaPoupancaDao {
	
	ArrayList<ContaPoupanca> listaContas = new ArrayList<>();
	
	public boolean adicionarConta(ContaPoupanca poupanca) {
		if (poupanca == null) return false;
		listaContas.add(poupanca);
		return true;
	}
	
	public ContaPoupanca buscarContaDao(int clienteId) {
		for (ContaPoupanca conta: listaContas) {
			if(conta.getIdCliente() == clienteId) return conta;
		}
		return null;
	}
	
	public void sacar(int id, double dinheiro) {
		for (ContaPoupanca conta : listaContas) {
			if( conta.getIdCliente() == id) {
				conta.setSaldo(conta.getSaldo() - dinheiro);
			}
		}
	}
	
	public void depositar(double dinheiro, int id) {
		for (ContaPoupanca conta : listaContas) {
			if( conta.getIdCliente()== id) {
				conta.setSaldo(conta.getSaldo() + dinheiro);
			}
		}
	}
	
	public double mostrarSaldo(int id) {
		for (ContaPoupanca conta : listaContas) {
			if( conta.getIdCliente()== id) {
				return conta.getSaldo();
			}
		}
		return 0;
	}
	
	public void transferir(double valor, int id, int idClienteDestino) {
		for (ContaPoupanca conta : listaContas) {
			if( conta.getIdCliente()== id) {
				conta.setSaldo(conta.getSaldo() - valor);
			}
		}
		for (ContaPoupanca conta : listaContas) {
			if( conta.getIdCliente()== idClienteDestino) {
				conta.setSaldo(conta.getSaldo() + valor);
			}
		}
	}
	
}

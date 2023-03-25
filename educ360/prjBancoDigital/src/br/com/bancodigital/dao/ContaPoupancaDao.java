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
	
	public boolean buscarClienteDao(String cpf, String senha) {
		
		Cliente cliente;
		return true;
	}
}

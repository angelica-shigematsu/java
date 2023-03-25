package br.com.bancodigital.service;

import br.com.bancodigital.dao.ClienteDao;
import br.com.bancodigital.entity.Cliente;

public class ClienteService {
    int qtdeDigitoCpf = 11;
	int qtdeDigitoSenha = 6;
	ClienteDao dao = new ClienteDao();
	
	public boolean adicionarCliente(String nome, String cpf, String senha) {
		
		if (!validarCpf(cpf)) return false;
		
		if (!validarNome(nome)) return false;
		
		if (!validarSenha(senha)) return false;
		
		Cliente cliente = new Cliente();
		dao.adicionarCliente(cliente);
		return true;
	}
	
	public int getUltimoClienteId() {		
		return dao.getUltimoCliente().getId();
	}
	
	public boolean validarCpf(String cpf) {
		if (cpf.isEmpty()) return false;
		
		if (cpf.length() < qtdeDigitoCpf)
			return false;
		
		return true;
	}
	
	public boolean validarNome(String nome) {
		for(char c : nome.toCharArray()) {
			if(Character.isDigit(c))
				return false;
		}
		return true;
	}
	
	public boolean validarSenha(String senha) {
		if (senha.length() < qtdeDigitoSenha)
			return false;
		
		for(char c : senha.toCharArray()) {
			if(!Character.isDigit(c))
				return false;
		}
		
		return true;
	}
}


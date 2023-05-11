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
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setSenha(senha);
		
		dao.adicionarCliente(cliente);
		return true;
	}
	
	public Cliente listarCliente(int id) {
		Cliente cliente;
		cliente = dao.buscarClienteDao(id);
		if (cliente!= null) return cliente;
		return null;
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
	
	public boolean validarLogin(int id, String senha) {
		if (senha.isEmpty()) return false;
		
		if (id < 0) return false;
		
//		if(dao.verificarLogin(id, senha)) return true;
		
		return false;
	}
}


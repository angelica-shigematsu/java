package br.com.bancodigital.service;

import br.com.bancodigital.dao.ContaDao;

public class ContaService {
	
	public boolean buscarClienteService(String cpf, String senha) {
		
		ContaDao dao = new ContaDao();
		
		dao.buscarClienteDao(cpf, senha);
		return true;
	}
	
	
}

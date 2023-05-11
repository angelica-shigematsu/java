package br.com.bancodigital.dao;

import java.util.ArrayList;

import br.com.bancodigital.entity.Cliente;

public class ClienteDao {
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	public void adicionarCliente(Cliente cliente) {
		cliente.setId(listaClientes.size());
		listaClientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	
	public Cliente getUltimoCliente() {
		return listaClientes.get( listaClientes.size() - 1 );
	}
	
	public Cliente buscarClienteDao(int clienteId) {
		for (Cliente cliente: listaClientes) {
			if(cliente.getId() == clienteId) return cliente;
		}
		return null;
	}
	
	public boolean verificarLogin(int id, String senha) {
		for (Cliente cliente: listaClientes) {
			if(cliente.getId() == id && cliente.getSenha().equals(senha)) return true;
		}
		return false;
	}

}

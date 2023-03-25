package br.com.bancodigital.entity;

public abstract class Conta {
	private int idCliente;
	private int numero;
	private double saldo;

	public Conta(int idCliente, int numero, double saldo) {
		this.idCliente = idCliente;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract void depositar(double valor);
	public abstract void transferir(double valor, Conta conta);
	public abstract double consultarExtrato();
	
	
		
}

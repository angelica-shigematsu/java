package br.com.bancodigital.entity;

public class ContaPoupanca extends Conta{
	

	public ContaPoupanca(int idCliente, int numero, double saldo) {
		super(idCliente, numero, saldo);
		// TODO Auto-generated constructor stub
	}

	public void transferir(double valor, Conta conta) {
		if (valor > 0) {
			conta.depositar(valor);
		}
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double consultarExtrato() {
		// TODO Auto-generated method stub
		return 0;
	}

}

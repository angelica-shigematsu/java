package br.com.bancodigital.entity;

public class ContaCorrente {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean acessarTalao() {
		if (getSaldo() > 0) {
			return true;
		}else {
			return false;
		}
	}

	public void depositar(double valor) {
		saldo += valor;	
	}

	public void transferir(double valor, Conta conta) {
		if (valor > 0) {
			conta.depositar(valor);
		}
	}


	public double consultarExtrato() {
		return getSaldo();
	}

}

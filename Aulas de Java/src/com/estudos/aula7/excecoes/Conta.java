package com.estudos.aula7.excecoes;

public class Conta {
	String nome;
	int saldo;
	
	public int getSaldo() {
		return saldo;
	}
	
	void deposita(int valor) {
		this.saldo += valor;
		System.out.println("Depositado: " + valor);
	}
	
	void saca(int valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente.");
		} else {
			this.saldo -= valor;
		}
	}
}

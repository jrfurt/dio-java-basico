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
	
	boolean saca(int valor) {
		if (valor > this.saldo) {
			System.out.println("Valor de saque maior que o saldo em conta");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
}

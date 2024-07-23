package com.estudos.aula3.constructor.comargs;

public class Conta2 {
	String titular;
	int numero;
	
	// construtor com argumento
	public Conta2(String titular) {
		this.titular = titular;
		System.out.println("Criando Conta2 no nome de " + this.titular);
	}
}

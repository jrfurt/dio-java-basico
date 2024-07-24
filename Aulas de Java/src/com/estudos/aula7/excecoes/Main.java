package com.estudos.aula7.excecoes;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		try {
			conta.saca(200);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}

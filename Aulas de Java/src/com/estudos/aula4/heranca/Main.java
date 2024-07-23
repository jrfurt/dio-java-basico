package com.estudos.aula4.heranca;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		System.out.println(gerente.getBonificacao());
	}
}

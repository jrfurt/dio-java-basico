package com.estudos.aula2;

public class Mostrador {
	public static void main(String[] args) {
		System.out.println("Oi");

		Calculadora calculadora = new Calculadora();

		calculadora.soma(4, 6);
		calculadora.subtracao(6, 5);
		calculadora.multiplicacao(4, 5);
		calculadora.divisao(5, 3);

		System.out.println("Fim");
	}
}

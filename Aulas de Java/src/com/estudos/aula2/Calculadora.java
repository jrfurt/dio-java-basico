package com.estudos.aula2;

public class Calculadora {
	void soma(int a, int b) {
		System.out.println(a + b);
	}

	void subtracao(int a, int b) {
		System.out.println(a - b);
	}

	void multiplicacao(int a, int b) {
		System.out.println(a * b);
	}

	void divisao(double a, double b) {
		System.out.println(String.format("%.1f", a / b));
	}
}

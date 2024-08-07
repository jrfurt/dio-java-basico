package com.estudos.aula8.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List<Numero> numeroList;
	
	public SomaNumeros() {
		numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public int calcularSoma() {
		int soma = 0;
		for (Numero n : numeroList) {
			soma += n.numero;
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = -1;
		for (Numero n : numeroList) {
			if (n.numero > maiorNumero) {
				maiorNumero = n.numero;
			}
		}
		
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = 1000;
		for (Numero n : numeroList) {
			if (n.numero < menorNumero) {
				menorNumero = n.numero;
			}
		}
		
		return menorNumero;
	}
	
	public void exibirNumeros() {
		System.out.println(this.numeroList);
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(8);
		somaNumeros.adicionarNumero(-2);
		somaNumeros.adicionarNumero(7);
		somaNumeros.adicionarNumero(-1);
		somaNumeros.exibirNumeros();
		System.out.println("Soma: " + somaNumeros.calcularSoma());
		System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
		System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
	}
}

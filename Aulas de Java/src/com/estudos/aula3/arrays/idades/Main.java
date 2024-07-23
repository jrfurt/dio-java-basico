package com.estudos.aula3.arrays.idades;

public class Main {
	public static void main(String[] args) {
		// criando um array de int de 10 posições
		int[] idades = new int[10];
		
		// populando posição 6 do array diretamente
		idades[5] = 10;
		
		int idade = 50;
		
		// populando posição 2 do array indiretamente
		idades[1] = idade;
		
		System.out.println(idades[1]);
		
		//////////////
		
		int[] pares = new int[10];
		
		int par = 2;
		
		pares[0] = par;
		
		System.out.println(pares[0]);
	}
}

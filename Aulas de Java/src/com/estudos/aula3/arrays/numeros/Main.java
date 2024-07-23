package com.estudos.aula3.arrays.numeros;

public class Main {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = i * 10;
		}
		
		imprimeArray(numeros);
		
		// criando array com shortcut syntax
		int[] inteiros = { 1, 2, 3, 4, 5 };
		
		imprimeArray(inteiros);
	}
	
	static void imprimeArray(int[] valores) {
		for (int i : valores) {
			System.out.println(i);
		} 
	}
}

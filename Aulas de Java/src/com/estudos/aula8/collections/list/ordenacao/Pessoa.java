package com.estudos.aula8.collections.list.ordenacao;

// Comparable e sempre implementado na propria classe
public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "{ nome: " + nome
			+ ", idade: " + idade 
			+ ", altura: " + altura
			+ " }";
	}

	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(idade, p.getIdade());
	}
}

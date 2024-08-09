package com.estudos.aula8.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	List<Pessoa> listPessoas;
	
	public OrdenacaoPessoas() {
		listPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorAltura());
		return pessoasPorAltura;
	}
	
	public void exibirPessoas() {
		System.out.println(listPessoas);
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
		
		ordenacao.adicionarPessoa("Junior", 18, 1.87);
		ordenacao.adicionarPessoa("Vanderlan", 56, 1.71);
		ordenacao.adicionarPessoa("Conde Drácula", 120, 1.85);
		ordenacao.adicionarPessoa("Armando", 25, 1.68);
	
		ordenacao.exibirPessoas();
		System.out.println(ordenacao.ordenarPorIdade());
		System.out.println(ordenacao.ordenarPorAltura());
	}
}

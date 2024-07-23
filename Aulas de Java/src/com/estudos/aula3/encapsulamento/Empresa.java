package com.estudos.aula3.encapsulamento;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int countEmpregados;
	
	// CONSTRUCTORS
	Empresa() {
		empregados = new Funcionario[5];
	}
	
	Empresa(int numeroFuncionarios) {
		empregados = new Funcionario[numeroFuncionarios];
	}
	
	// GETTERS
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public Funcionario getFuncionario(int posicao) {
		return empregados[posicao];
	}
	
	public void getAllFuncionarios() {
		for (int i = 0; i < empregados.length; i++) {
			System.out.println("Funcionario na posição: " + i);
			System.out.println("Id: " + empregados[i].getIdentificador());
			System.out.println("Nome:" + empregados[i].getNome());
			System.out.println("Salário: " + empregados[i].getSalario());
		}
	}
	
	// SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// METHODS
	public void adiciona(Funcionario f) {
		this.empregados[countEmpregados] = f;
		countEmpregados++;
	}
}
